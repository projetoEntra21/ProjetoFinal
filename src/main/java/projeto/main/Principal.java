package projeto.main;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.historico.HistoricoDAO;
import projeto.modelo.entidade.historico.HistoricoDAOImpl;
import projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista;
import projeto.modelo.entidade.historico.entidade.nutricionista.NutricionistaDAO;
import projeto.modelo.entidade.historico.entidade.nutricionista.NutricionistaDAOimpl;
import projeto.modelo.entidade.historico.entidade.paciente.Paciente;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAOimpl;
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
		
//		String nome = "Gabriel";
//		String sobrenome = "Santos";
//		String cpf = "123.456.789-00";
//		int idade = 17;
//
//		Paciente paciente = new Paciente();
//
//		paciente.setNome(nome);
//		paciente.setIdade(idade);
//		paciente.setCpf(cpf);
//		paciente.setSobrenome(sobrenome);
//
//		pacienteDAO.inserirPaciente(paciente);
//
//		String email = "entra21@teste.pfvvai";
//		String telefone = "33377676";
//		String celular = "478997382";
//		
//		Contato contato = new Contato();
//
//		contato.setCelular(celular);
//		contato.setEmail(email);
//		contato.setTelefone(telefone);
//		contato.setPaciente(paciente);
//	
//		contatoDAO.inserirContato(contato);
		
		Paciente paciente2 = new Paciente();
		
		String nome2 = "Ana";
		String sobrenome2 = "Eshelley";
		String cpf2 = "123.466.789-00";
		int idade2 = 18;
		
		paciente2.setNome(nome2);
		paciente2.setIdade(idade2);
		paciente2.setCpf(cpf2);
		paciente2.setSobrenome(sobrenome2);	
		
		Nutricionista nutricionista =  new Nutricionista();
				;
		String nome3 = "Paulo";
		String sobrenome3 = "José";
		String cpnj = "36.152.690/0001-41";
		
		nutricionista.setCnpj(cpnj);
		nutricionista.setNome(nome3);
		nutricionista.setSobrenome(sobrenome3);
		nutricionista.setPaciente(paciente2);
		
		nutricionistaDAO.cadastrarNutricionista(nutricionista);
		
		
	}

}