package projeto.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista;
import projeto.modelo.entidade.historico.entidade.nutricionista.NutricionistaDAO;
import projeto.modelo.entidade.historico.entidade.paciente.Paciente;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.historico.info.consulta.Consulta;
import projeto.modelo.entidade.historico.info.consulta.ConsultaDAO;
import projeto.modelo.entidade.historico.info.consulta.ConsultaDAOimpl;

@WebServlet("/")
public class ConsultaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ConsultaDAO dao;
	private PacienteDAO dao2;
	private NutricionistaDAO dao3;

	public void init() {
		dao = new ConsultaDAOimpl();
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
			case "/inserirConsulta":
				inserirConsulta(request, response);
				break;
			case "/deletarConsulta":
				deletarConsulta(request, response);
				break;
			case "/atualizarConsulta":
				atualizarConsulta(request, response);
				break;
			default:
				listarConsultas(request, response);
				break;
			}

		} catch (SQLException sqlException) {
			throw new ServletException();
		}

	}

	private void listarConsultas(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Consulta> consultas = dao.recuperarConsultas();
		request.setAttribute("consulta", consultas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);

	}

	private void inserirConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Consulta> consultas = new ArrayList<Consulta>();

		String nome = request.getParameter("nome_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		LocalDate date = LocalDate.parse(request.getParameter("dia"));
		LocalTime hora = LocalTime.parse(request.getParameter("hora"));
		Paciente paciente = dao2.recuperarPaciente(new Paciente(nome, sobrenome));
		Nutricionista nutricionista = dao3.recuperarNutricionista(new Nutricionista(idnutri));
		Consulta consulta = dao.inserirConsulta(new Consulta(hora, date, nutricionista, paciente));
		consultas.add(consulta);
		dao2.atualizarPaciente(new Paciente(nome, sobrenome, consultas));
		dao3.atualizarNutriocionista(new Nutricionista(idnutri, consultas));

	}

	private void deletarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {

		long id = Long.parseLong(request.getParameter("id_consulta"));
		Consulta consulta = dao.recuperarConsulta(new Consulta(id));
		dao.deletarConsulta(consulta);

	}

	private void atualizarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		long idconsulta = Long.parseLong(request.getParameter("id_consulta"));
		long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		long idpaciente = Long.parseLong(request.getParameter("id_paciente"));
		LocalDate date = LocalDate.parse(request.getParameter("data_consulta"));
		LocalTime hora = LocalTime.parse(request.getParameter("horario_consulta"));
		Paciente paciente = dao2.recuperarPaciente(new Paciente(idpaciente));
		Nutricionista nutricionista = dao3.recuperarNutricionista(new Nutricionista(idnutri));
		dao.atualizarConsulta(new Consulta(idconsulta, hora, date, nutricionista, paciente));

	}

}
