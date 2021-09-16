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

import modelo.dao.historico.HistoricoDAO;
import modelo.dao.historico.HistoricoDAOImpl;
import modelo.entidade.historico.Historico;

@WebServlet("/")
public class HistoricoServelet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HistoricoDAO dao;

	public void init() {
		dao = new HistoricoDAOImpl();

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

			case "/inserirHistorico":
				inserirHistorico(request, response);
				break;

			case "/deletarHistorico":
				deletarHistorico(request, response);
				break;

			case "/atualizarHistorico":
				atualizarHistorico(request, response);
				break;

			default:
				listarHistoricos(request, response);
				break;

			}

		} catch (SQLException ex) {
			throw new ServletException(ex);

		}
	}

	private void listarHistoricos(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Historico> historicos = dao.recuperarHistoricos();
		request.setAttribute("historico", historicos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
	}

	private void inserirHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		double peso = Double.parseDouble(request.getParameter("peso_historico"));
		double altura = Double.parseDouble(request.getParameter("altura_historico"));
		double quadril = Double.parseDouble(request.getParameter("quadril_historico"));
		double cintura = Double.parseDouble(request.getParameter("cintura_historico"));
		double imc = Double.parseDouble(request.getParameter("imc_historico"));
		double densidade = Double.parseDouble(request.getParameter("densidade_historico"));
		dao.inserirHistorico(new Historico(peso, altura, quadril, cintura, imc, densidade));
		response.sendRedirect("listar");
	}

	private void deletarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Historico historico = dao.recuperarHistorico(new Historico(id));
		dao.deletarHistorico(historico);
		response.sendRedirect("listar");
	}

	private void atualizarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		double quadril = Double.parseDouble(request.getParameter("quadril"));
		double cintura = Double.parseDouble(request.getParameter("cintura"));
		double imc = Double.parseDouble(request.getParameter("imc"));
		double densidade = Double.parseDouble(request.getParameter("densidade"));
		dao.atualizarHistorico(new Historico(id, peso, altura, quadril, cintura, imc, densidade));
		response.sendRedirect("listar");

	}
}
