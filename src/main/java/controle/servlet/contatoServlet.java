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

import modelo.dao.contato.ContatoDAO;
import modelo.dao.contato.ContatoDAOimpl;
import modelo.entidade.contato.Contato;

@WebServlet("/")
public class contatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ContatoDAO dao;

	public void init() {
		dao = new ContatoDAOimpl();
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

			case "/inserirContato":
				inserirContato(request, response);
				break;

			case "/deletarContato":
				deletarContato(request, response);
				break;

			case "/atualizarContato":
				atualizarContato(request, response);
				break;

			default:
				listarContatos(request, response);
				break;

			}

		} catch (SQLException sqlException) {
			throw new ServletException(sqlException);
		}

	}

	private void listarContatos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Contato> contatos = dao.recuperarContatos();
		request.setAttribute("contatos", contatos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);

	}

	private void inserirContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String telefone = request.getParameter("telefone_contato");
		String email = request.getParameter("email_contato");
		String celular = request.getParameter("email_contato");
		dao.inserirContato(new Contato(id, telefone, email, celular));
	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = dao.recuperarContato(new Contato(id));
		dao.deletarContato(contato);

	}
	private void atualizarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String telefone = request.getParameter("telefone_contato");
		String email = request.getParameter("email_contato");
		String celular = request.getParameter("email_contato");
		dao.atualizarContato(new Contato(id, telefone, email, celular));
	}

}
