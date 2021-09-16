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

import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.nutricionista.NutricionistaDAOimpl;
import modelo.entidade.nutricionista.Nutricionista;

@WebServlet("/")
public class NutricionistaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private NutricionistaDAO dao;

	public void init() {
		dao = new NutricionistaDAOimpl();
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

			case "/inserirNutricionista": 
				inserirNutricionista(request, response);
				break;

			case "/deletarNutricionista":
				deletarNutricionista(request, response);
				break;

			case "/atualizarNutricionista":
				atualizarNutricionista(request, response);

			default:
				listarNutricionistas(request, response);
				break;

			}

		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listarNutricionistas(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Nutricionista> nutricionistas = dao.recuperarNutricionistas();
		request.setAttribute("nutricionista", nutricionistas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listar-contato.jsp");
		dispatcher.forward(request, response);

	}

	private void inserirNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String nome = request.getParameter("nome_nutricionista");
		String sobrenome = request.getParameter("sobrenome_nutricionista");
		String cnpj = request.getParameter("cnpj");
		dao.inserirNutricionista(new Nutricionista(nome, sobrenome, cnpj));

	}

	private void deletarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_nutricionista"));
		Nutricionista nustricionista = dao.recuperarNutricionista(new Nutricionista(id));
		dao.deletarNutricionista(nustricionista);

	}

	public void atualizarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_nutricionista"));
		String nome = request.getParameter("nome_nutricionista");
		String sobrenome = request.getParameter("sobrenome_nutricionista");
		String cnpj = request.getParameter("cnpj");
		dao.atualizarNutriocionista(new Nutricionista(id, nome, sobrenome, cnpj));

	}

}
