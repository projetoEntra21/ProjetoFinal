package projeto.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.modelo.entidade.usuario.Usuario;
import projeto.modelo.entidade.usuario.UsuarioDAO;
import projeto.modelo.entidade.usuario.UsuarioDAOimpl;

@WebServlet("/")
public class UsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UsuarioDAO dao;

	public void init() {
		dao = new UsuarioDAOimpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {

			switch (action) {

			case "/inserirUsuario":
				inserirUsuario(request, response);
				break;

			case "/deletarUsuario":
				deletarUsuario(request, response);
				break;

			case "/atualizarUsuario":
				atualizarUsuario(request, response);
				break;

			default:
				listarUsuarios(request, response);

			}

		} catch (SQLException sqlException) {
			throw new ServletException();
		}

	}

	private void listarUsuarios(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Usuario> usuarios = dao.recuperarUsuarios();
		request.setAttribute("contatos", usuarios);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);

	}

	private void inserirUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login_usuario");
		String senha = request.getParameter("senha_usuario");
		dao.atualizarUsuario(new Usuario(login, senha));

	}

	private void deletarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id_usuario"));
		Usuario usuario = dao.recuperarUsuario(new Usuario(id));
		dao.deletarUsuario(usuario);

	}

	private void atualizarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id_usuario"));
		String loginString = request.getParameter("login_usuario");
		String senha = request.getParameter("senha_usuario");
		dao.atualizarUsuario(new Usuario(id, loginString, senha));

	}
}
