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

import modelo.dao.endereco.EnderecoDAOimpl;
import modelo.dao.endereco.EndereçoDAO;
import modelo.entidade.endereco.Endereço;

@WebServlet("/Endereço")
public class EndereçoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EndereçoDAO dao;

	public void init() {
		dao = new EnderecoDAOimpl();
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

			case "/inserirEndereço":
				inserirEndereço(request, response);
				break;

			case "/deletarEndereço":
				deletarEndereço(request, response);
				break;

			case "/atualizarEndereço":
				atualizarEndereço(request, response);
				break;

			default:
				listarEndereços(request, response);
				break;

			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listarEndereços(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Endereço> endereços = dao.recuperarEndereços();
		request.setAttribute("endereço", endereços);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}

	private void inserirEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String rua = request.getParameter("rua_endereço");
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		dao.inserirEndereço(new Endereço(rua, cep, numero, complemento));
		response.sendRedirect("listar");
	}

	private void deletarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Endereço endereço = dao.recuperarEndereço(new Endereço(id));
		dao.deletarEndereço(endereço);
		response.sendRedirect("listar");

	}

	private void atualizarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String rua = request.getParameter("rua_endereço");
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		dao.atualizarEndereço(new Endereço(id, rua, cep, numero, complemento));
		response.sendRedirect("listar");
	}
}