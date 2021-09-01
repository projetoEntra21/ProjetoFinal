package projeto.main;

import java.sql.Date;
import java.sql.Time;

import javax.xml.crypto.Data;

import org.hibernate.dialect.InterbaseDialect;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.historico.HistoricoDAO;
import projeto.modelo.entidade.historico.HistoricoDAOImpl;
import projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista;
import projeto.modelo.entidade.historico.entidade.nutricionista.NutricionistaDAO;
import projeto.modelo.entidade.historico.entidade.nutricionista.NutricionistaDAOimpl;
import projeto.modelo.entidade.historico.entidade.paciente.Paciente;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAOimpl;
import projeto.modelo.entidade.historico.info.consulta.Consulta;
import projeto.modelo.entidade.historico.info.consulta.ConsultaDAO;
import projeto.modelo.entidade.historico.info.consulta.ConsultaDAOimpl;
import projeto.modelo.entidade.historico.info.contato.Contato;
import projeto.modelo.entidade.historico.info.contato.ContatoDAO;
import projeto.modelo.entidade.historico.info.contato.ContatoDAOimpl;
import projeto.modelo.entidade.historico.info.endereco.EndereçoDAO;
import projeto.modelo.entidade.historico.info.endereco.EndereçoDAOimpl;

public class Principal {

	public static void main(String[] args) throws IdadeINvalidaExecption {
//
//		FoodDAO foodDAO = new FoodDAOImpl();
//
//		JSONObject jsonObject = foodDAO.readJsonFromUrl(
//				"https://api.edamam.com/api/food-database/v2/parser?app_id=0ade5519&app_key=765cf001c347b17087e6af924d562b33&ingr=pasta&nutrition-type=cooking");
//
//		Object parsed = jsonObject.getJSONArray("parsed");
//		
//		System.out.println(parsed);
//
//	

		EndereçoDAO endereçoDAO = new EndereçoDAOimpl();
		PacienteDAO pacienteDAO = new PacienteDAOimpl();
		ContatoDAO contatoDAO = new ContatoDAOimpl();
		HistoricoDAO historicoDAO = new HistoricoDAOImpl();
		NutricionistaDAO nutricionistaDAO = new NutricionistaDAOimpl();
		ConsultaDAO consultaDAO = new ConsultaDAOimpl(); 

		String nome = "Pedro";
		String sobrenome = "Fonseca";
		String cpf = "957.893.123-59";
		int idade = 16;
		
		Paciente paciente =  new Paciente();
		
		paciente.setIdade(idade);
		paciente.setNome(nome);
		paciente.setCpf(cpf);
		paciente.setSobrenome(sobrenome);
		
		int hora = 13;
		int minuto = 30;
		int segundo = 00;
		int ano = 2021;
		int mes = 8;
		int dia = 10;  
		
		Time time = new Time(hora, minuto, segundo);
		
		Date date = new Date(ano, mes, dia); 
		
		Consulta consulta =  new Consulta();
		
		consulta.setData(date);
		consulta.setHora(time);
		
		paciente.AdicionarConsulta(consulta);
		
		String nome1 = "Rogerio";
		String cpnj = "17.604.856/0001-79";
		String sobrenome1 = "Rodrigues";
		
		Nutricionista nutricionista = new Nutricionista();
		
		nutricionista.setCnpj(cpnj);
		nutricionista.setNome(nome1);
		nutricionista.setSobrenome(sobrenome1);
		
		nutricionista.adicionarConsulta(consulta);
		
		pacienteDAO.inserirPaciente(paciente);
		consultaDAO.inserirConsulta(consulta);
		nutricionistaDAO.cadastrarNutricionista(nutricionista);
		
	}

}