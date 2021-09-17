package controle.servlet;

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

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import controle.execptions.IdadeINvalidaExecption;
import modelo.dao.consulta.ConsultaDAO;
import modelo.dao.contato.ContatoDAO;
import modelo.dao.endereco.EndereçoDAO;
import modelo.dao.historico.HistoricoDAO;
import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.paciente.PacienteDAO;
import modelo.dao.paciente.PacienteDAOimpl;
import modelo.dao.usuario.UsuarioDAO;
import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereço;
import modelo.entidade.historico.Historico;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;
import modelo.entidade.usuario.Usuario;

@WebServlet("/")
public class PacienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private PacienteDAO dao;
	private ConsultaDAO dao2;
	private ContatoDAO dao3;
	private EndereçoDAO dao4;
	private NutricionistaDAO dao5;
	private UsuarioDAO dao6;
	private HistoricoDAO dao7;

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

			case "/home":

				chamarHome(request, response);
				break;

			case "/inserirPaciente":
				inserirPaciente(request, response);
				break;

			case "/deletarPaciente":
				deletarPaciente(request, response);
				break;

			case "/atualizarPaciente":
				atualizarPaciente(request, response);
				break;

			case "/inserirConsulta":
				inserirConsulta(request, response);
				break;
			case "/deletarConsulta":
				deletarConsulta(request, response);
				break;
			case "/atualizarConsulta":
				atualizarConsulta(request, response);
				break;

			case "/inserirContato":
				inserirContato(request, response);
				break;

			case "/deletarContato":
				deletarContato(request, response);
				break;

			case "/atualizarContato":
				atualizarContato(request, response);
				break;

			case "/inserirEndereço":
				inserirEndereço(request, response);
				break;

			case "/deletarEndereço":
				deletarEndereço(request, response);
				break;

			case "/atualizarEndereço":
				atualizarEndereço(request, response);
				break;

			case "/inserirHistorico":
				inserirHistorico(request, response);
				break;

			case "/deletarHistorico":
				deletarHistorico(request, response);
				break;

			case "/atualizarHistorico":
				atualizarHistorico(request, response);
				break;

			case "/inserirNutricionista":
				inserirNutricionista(request, response);
				break;

			case "/deletarNutricionista":
				deletarNutricionista(request, response);
				break;

			case "/atualizarNutricionista":
				atualizarNutricionista(request, response);

			case "/inserirUsuario":
				inserirUsuario(request, response);
				break;

			case "/deletarUsuario":
				deletarUsuario(request, response);
				break;

			case "/atualizarUsuario":
				atualizarUsuario(request, response);
				break;

//			default:
//				listarPacientes(request, response);
//				break;
			}

		} catch (SQLException | IdadeINvalidaExecption ex) {
			throw new ServletException(ex);
		}
	}

//	public void listarPacientes(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		List<Paciente> pacientes = dao.recuperarPacientes();
//		request.setAttribute("paciente", pacientes);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("");
//		dispatcher.forward(request, response);
//	}

	private void inserirHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		double peso = Double.parseDouble(request.getParameter("peso_historico"));
		double altura = Double.parseDouble(request.getParameter("altura_historico"));
		double quadril = Double.parseDouble(request.getParameter("quadril_historico"));
		double cintura = Double.parseDouble(request.getParameter("cintura_historico"));
		double imc = Double.parseDouble(request.getParameter("imc_historico"));
		double densidade = Double.parseDouble(request.getParameter("densidade_historico"));
		dao7.inserirHistorico(new Historico(peso, altura, quadril, cintura, imc, densidade));
		response.sendRedirect("listar");
	}

	private void deletarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Historico historico = dao7.recuperarHistorico(new Historico(id));
		dao7.deletarHistorico(historico);
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
		dao7.atualizarHistorico(new Historico(id, peso, altura, quadril, cintura, imc, densidade));
		response.sendRedirect("listar");

	}

	private void inserirUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login_usuario");
		String senha = request.getParameter("senha_usuario");
		dao6.inserirUsuario(new Usuario(login, senha));

	}

	private void deletarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id_usuario"));
		Usuario usuario = dao6.recuperarUsuario(new Usuario(id));
		dao6.deletarUsuario(usuario);

	}

	private void atualizarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id_usuario"));
		String loginString = request.getParameter("login_usuario");
		String senha = request.getParameter("senha_usuario");
		dao6.atualizarUsuario(new Usuario(id, loginString, senha));

	}

	private void inserirNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String nome = request.getParameter("nome_nutricionista");
		String sobrenome = request.getParameter("sobrenome_nutricionista");
		String cnpj = request.getParameter("cnpj");
		dao5.inserirNutricionista(new Nutricionista(nome, sobrenome, cnpj));

	}

	private void deletarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_nutricionista"));
		Nutricionista nustricionista = dao5.recuperarNutricionista(new Nutricionista(id));
		dao5.deletarNutricionista(nustricionista);

	}

	public void atualizarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_nutricionista"));
		String nome = request.getParameter("nome_nutricionista");
		String sobrenome = request.getParameter("sobrenome_nutricionista");
		String cnpj = request.getParameter("cnpj");
		dao5.atualizarNutriocionista(new Nutricionista(id, nome, sobrenome, cnpj));

	}

	private void inserirEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String rua = request.getParameter("rua_endereço");
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		dao4.inserirEndereço(new Endereço(rua, cep, numero, complemento));
		response.sendRedirect("listar");
	}

	private void deletarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Endereço endereço = dao4.recuperarEndereço(new Endereço(id));
		dao4.deletarEndereço(endereço);
		response.sendRedirect("listar");

	}

	private void atualizarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String rua = request.getParameter("rua_endereço");
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		dao4.atualizarEndereço(new Endereço(id, rua, cep, numero, complemento));
		response.sendRedirect("listar");
	}

	private void inserirContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String telefone = request.getParameter("telefone_contato");
		String email = request.getParameter("email_contato");
		String celular = request.getParameter("email_contato");
		dao3.inserirContato(new Contato(id, telefone, email, celular));
	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = dao3.recuperarContato(new Contato(id));
		dao3.deletarContato(contato);

	}

	private void atualizarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String telefone = request.getParameter("telefone_contato");
		String email = request.getParameter("email_contato");
		String celular = request.getParameter("email_contato");
		dao3.atualizarContato(new Contato(id, telefone, email, celular));
	}

	private void inserirConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Consulta> consultas = new ArrayList<Consulta>();

		String nome = request.getParameter("nome_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		LocalDate date = LocalDate.parse(request.getParameter("dia"));
		LocalTime hora = LocalTime.parse(request.getParameter("hora"));
		Paciente paciente = dao.recuperarPaciente(new Paciente(nome, sobrenome));
		Nutricionista nutricionista = dao5.recuperarNutricionista(new Nutricionista(idnutri));
		Consulta consulta = dao2.inserirConsulta(new Consulta(hora, date, nutricionista, paciente));
		consultas.add(consulta);
		dao.atualizarPaciente(new Paciente(nome, sobrenome, consultas));
		dao5.atualizarNutriocionista(new Nutricionista(idnutri, consultas));

	}

	private void deletarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {

		long id = Long.parseLong(request.getParameter("id_consulta"));
		Consulta consulta = dao2.recuperarConsulta(new Consulta(id));
		dao2.deletarConsulta(consulta);

	}

	private void atualizarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		long idconsulta = Long.parseLong(request.getParameter("id_consulta"));
		long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		long idpaciente = Long.parseLong(request.getParameter("id_paciente"));
		LocalDate date = LocalDate.parse(request.getParameter("data_consulta"));
		LocalTime hora = LocalTime.parse(request.getParameter("horario_consulta"));
		Paciente paciente = dao.recuperarPaciente(new Paciente(idpaciente));
		Nutricionista nutricionista = dao5.recuperarNutricionista(new Nutricionista(idnutri));
		dao2.atualizarConsulta(new Consulta(idconsulta, hora, date, nutricionista, paciente));

	}

	public void inserirPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, IdadeINvalidaExecption {

		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		dao.inserirPaciente(new Paciente(nome, cpf, sobrenome, idade));
//		response.sendRedirect("listar");
	}

	public void deletarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Paciente paciente = dao.recuperarPaciente(new Paciente(id));
		dao.deletarPaciente(paciente);
//		response.sendRedirect("listar");

	}

	public void atualizarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, NumberFormatException, IdadeINvalidaExecption {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		dao.atualizarPaciente(new Paciente(id, nome, cpf, sobrenome, idade));
//		response.sendRedirect("listar");

	}

	public void chamarHome(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

}
