package controle.servlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.execptions.IdadeINvalidaExecption;
import modelo.dao.paciente.PacienteDAO;
import modelo.dao.paciente.PacienteDAOimpl;
import modelo.entidade.paciente.Paciente;


@WebServlet("/")
public class PacienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private PacienteDAO dao;

	public void init() {
		dao = new PacienteDAOimpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {

			switch (action) {

			case "/inserirPaciente":
				inserirPaciente(request, response);
				break;

			case "/deletarPaciente":
				deletarPaciente(request, response);
				break;

			case "/atualizarPaciente":
				atualizarPaciente(request, response);
				break;

			default:
				listarPacientes(request, response);
				break;
			}

		} catch (SQLException | IdadeINvalidaExecption ex) {
			throw new ServletException(ex);
		}
	}

	public void listarPacientes(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Paciente> pacientes = dao.recuperarPacientes();
		request.setAttribute("paciente", pacientes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-paciente.jsp");
		dispatcher.forward(request, response);
	}

	public void inserirPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, IdadeINvalidaExecption {

		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		dao.inserirPaciente(new Paciente(nome, cpf, sobrenome, idade));
		response.sendRedirect("listar");
	}

	public void deletarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Paciente paciente = dao.recuperarPaciente(new Paciente(id));
		dao.deletarPaciente(paciente);
		response.sendRedirect("listar");

	}

	public void atualizarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, NumberFormatException, IdadeINvalidaExecption {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		dao.atualizarPaciente(new Paciente(id, nome, cpf, sobrenome, idade));
		response.sendRedirect("listar");

	}

}
