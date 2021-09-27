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

import modelo.dao.consulta.ConsultaDAO;
import modelo.dao.consulta.ConsultaDAOimpl;
import modelo.dao.contato.ContatoDAO;
import modelo.dao.contato.ContatoDAOimpl;
import modelo.dao.endereco.EnderecoDAOimpl;
import modelo.dao.endereco.EndereçoDAO;
//import modelo.dao.endereco.EnderecoDAOimpl;
//import modelo.dao.endereco.EndereçoDAO;
import modelo.dao.historico.HistoricoDAO;
import modelo.dao.historico.HistoricoDAOImpl;
import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.nutricionista.NutricionistaDAOimpl;
import modelo.dao.paciente.PacienteDAO;
import modelo.dao.paciente.PacienteDAOimpl;
import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereço;
import modelo.entidade.historico.Historico;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;

@WebServlet("/")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private PacienteDAO daoPaciente;
	private NutricionistaDAO daoNutricionista;
	private EndereçoDAO daoEndereço;
	private ConsultaDAO daoConsulta;
	private HistoricoDAO daoHistorico;
	private ContatoDAO daoContato;

	public void init() {
		
		daoPaciente = new PacienteDAOimpl();
		daoNutricionista = new NutricionistaDAOimpl();
		daoEndereço = new EnderecoDAOimpl();
		daoConsulta =  new ConsultaDAOimpl();
		daoHistorico = new HistoricoDAOImpl();
		daoContato = new ContatoDAOimpl();
	
		
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

			case "/perfilPaciente":
				mostrarPerfilPaciente(request, response);

			case "/home":
				mostrarHome(request, response);
				break;

			case "/inserir":
				inserirContato(request, response);
				break;

			case "/deletar":
				deletarContato(request, response);
				break;

			case "/atualizar":
				atualizarContato(request, response);
				break;

			case "/inserirMedidas":
				inserirHistorico(request, response);
				break;

			case "/deletarMedidas":
				deletarHistorico(request, response);
				break;

			case "/atualizarMedidas":
				atualizarHistorico(request, response);
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

			case "/inserirPaciente":
				inserirPaciente(request, response);
				break;

			case "/deletarPaciente":
				deletarPaciente(request, response);
				break;

			case "/atualizarPaciente":
				atualizarPaciente(request, response);
				break;

			case "/inserirNutricionista":
				inserirNutricionista(request, response);
				break;

			case "/deletarNutricionista":
				deletarNutricionista(request, response);
				break;

			case "/atualizarNutricionista":
				atualizarNutricionista(request, response);

			case "/mostrarAgendamento":
				mostrarAgendamento(request, response);
				break;

			case "/mostrarCadastroPaciente":
				mostrarCadastroPaciente(request, response);
				break;

			case "/mostrarCadastroNutricionista":
				mostrarCadastroNutricionista(request, response);
				break;

			case "/mostrarMedidas":
				mostrarMedidas(request, response);

			case "/telainicial":
				telainicial(request, response);

			case "/inserirEndereço":
				inserirEndereço(request, response);
				
			case "/atualizarEndereço":
				atualizarEndereço(request, response);
				
			case "/deletarEndereço":
				deletarEndereço(request, response);	
				
			default:
				mostrarHome(request, response);
				break;
			}

		} catch (

		SQLException sqlException) {
			throw new ServletException();
		}
	}

	public void telainicial(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("primeiratela.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarMedidas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("medidas.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarCadastroNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastronutricionista.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarCadastroPaciente(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastropaciente.jsp");
		dispatcher.forward(request, response);
	}

	public void mostrarHome(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("newhome.jsp");
		dispatcher.forward(request, response);

	}

	public void mostrarPerfilPaciente(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException, ServletException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);

	}

	public void mostrarAgendamento(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("agendamento.jsp");
		dispatcher.forward(request, response);
	}

	private void inserirContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular");
		daoContato.inserirContato(new Contato(telefone, email, celular));
	}

	private void atualizarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		String celular = request.getParameter("celular");
		daoContato.atualizarContato(new Contato(id, telefone, email, celular));
	}

	private void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = daoContato.recuperarContato(new Contato(id));
		daoContato.deletarContato(contato);
	}

	private void inserirHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

	
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		double quadril = Double.parseDouble(request.getParameter("quadril"));
		double cintura = Double.parseDouble(request.getParameter("cintura"));
		double busto = Double.parseDouble(request.getParameter("busto"));
		LocalDate date = LocalDate.parse(request.getParameter("data"));

		
		daoHistorico.inserirHistorico(new Historico(peso, altura, quadril, cintura, busto, date));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);
	}

	private void deletarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Historico historico = daoHistorico.recuperarHistorico(new Historico(id));
		daoHistorico.deletarHistorico(historico);
		
		
		
	}

	private void atualizarHistorico(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		double quadril = Double.parseDouble(request.getParameter("quadril"));
		double cintura = Double.parseDouble(request.getParameter("cintura"));
		double busto = Double.parseDouble(request.getParameter("busto"));
		LocalDate date = LocalDate.parse(request.getParameter("dia"));
		daoHistorico.atualizarHistorico(new Historico(id, peso, altura, quadril, cintura, busto, date));

	}

	private void inserirConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Consulta> consultas = new ArrayList<Consulta>();

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		long idnutri = Long.parseLong(request.getParameter("id"));
		LocalDate date = LocalDate.parse(request.getParameter("dia"));
		LocalTime hora = LocalTime.parse(request.getParameter("hora"));
		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(nome, sobrenome));
		Nutricionista nutricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(idnutri));
		Consulta consulta = daoConsulta.inserirConsulta(new Consulta(hora, date, nutricionista, paciente));
		consultas.add(consulta);
		daoPaciente.atualizarPaciente(new Paciente(nome, sobrenome, consultas));
		daoNutricionista.atualizarNutriocionista(new Nutricionista(idnutri, consultas));

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);

		
	}

	private void deletarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {

		long id = Long.parseLong(request.getParameter("id_consulta"));
		Consulta consulta = daoConsulta.recuperarConsulta(new Consulta(id));
		daoConsulta.deletarConsulta(consulta);

	}

	private void atualizarConsulta(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		long idconsulta = Long.parseLong(request.getParameter("id_consulta"));
		Long idnutri = Long.parseLong(request.getParameter("id_nutricionista"));
		long idpaciente = Long.parseLong(request.getParameter("id_paciente"));
		LocalDate date = LocalDate.parse(request.getParameter("data_consulta"));
		LocalTime hora = LocalTime.parse(request.getParameter("horario_consulta"));
		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(idpaciente));
		Nutricionista nutricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(idnutri));
		daoConsulta.atualizarConsulta(new Consulta(idconsulta, hora, date, nutricionista, paciente));

	}

	private void inserirEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		daoEndereço.inserirEndereço(new Endereço(cep, numero, complemento));
	}

	private void deletarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Endereço endereço = daoEndereço.recuperarEndereço(new Endereço(id));
		daoEndereço.deletarEndereço(endereço);

	}

	private void atualizarEndereço(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		String cep = request.getParameter("cep_endereço");
		long numero = Long.parseLong(request.getParameter("numero_endereço"));
		String complemento = request.getParameter("complemento_endereço");
		daoEndereço.atualizarEndereço(new Endereço(id, cep, numero, complemento));
	}

	public void listarPacientes(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		List<Paciente> pacientes = daoPaciente.recuperarPacientes();
		request.setAttribute("paciente", pacientes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro-paciente.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

	public void inserirPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String sobrenome = request.getParameter("sobrenome");
		String senha = request.getParameter("senha");
		long idade = Long.parseLong(request.getParameter("idade"));
		
		daoPaciente.inserirPaciente(new Paciente(email, nome, cpf, sobrenome, idade, senha));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilpaciente.jsp");
		dispatcher.forward(request, response);

		
		
	}

	public void deletarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		long id = Long.parseLong(request.getParameter("id_paciente"));
		Paciente paciente = daoPaciente.recuperarPaciente(new Paciente(id));
		daoPaciente.deletarPaciente(paciente);
		response.sendRedirect("listar");

	}

	public void atualizarPaciente(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, NumberFormatException {

		int id = Integer.parseInt(request.getParameter("id_paciente"));
		String nome = request.getParameter("nome_paciente");
		String cpf = request.getParameter("cpf_paciente");
		String sobrenome = request.getParameter("sobrenome_paciente");
		int idade = Integer.parseInt(request.getParameter("idade_paciente"));
		daoPaciente.atualizarPaciente(new Paciente(id, nome, cpf, sobrenome, idade));

	}

	private void inserirNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {

		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cnpj = request.getParameter("cnpj");
		String senha = request.getParameter("senha");

		daoNutricionista.inserirNutricionista(new Nutricionista(nome, sobrenome, cnpj, senha));

		RequestDispatcher dispatcher = request.getRequestDispatcher("perfilnutricionista.jsp");
		dispatcher.forward(request, response);

	}

	private void deletarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		Long id = Long.parseLong(request.getParameter("id_nutricionista"));
		Nutricionista nustricionista = daoNutricionista.recuperarNutricionista(new Nutricionista(id));
		daoNutricionista.deletarNutricionista(nustricionista);

	}

	public void atualizarNutricionista(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		Long id = Long.parseLong(request.getParameter("id_nutricionista"));
		String nome = request.getParameter("nome_nutricionista");
		String sobrenome = request.getParameter("sobrenome_nutricionista");
		String cnpj = request.getParameter("cnpj_nutricionista");
		String senha = request.getParameter("senha_nutricionista");
		daoNutricionista.atualizarNutriocionista(new Nutricionista(id, nome, sobrenome, cnpj, senha));

	}

}
