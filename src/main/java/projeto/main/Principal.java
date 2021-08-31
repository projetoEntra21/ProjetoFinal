package projeto.main;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.historico.entidade.paciente.Paciente;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.historico.entidade.paciente.PacienteDAOimpl;
import projeto.modelo.entidade.historico.info.contato.Contato;
import projeto.modelo.entidade.historico.info.contato.ContatoDAO;
import projeto.modelo.entidade.historico.info.contato.ContatoDAOimpl;
import projeto.modelo.entidade.historico.info.endereco.Endereço;
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

		String nome = "Gabriel";
		String sobrenome = "Santos";
		String cpf = "123.456.789-00";
		int idade = 17;

		Paciente paciente = new Paciente();

		paciente.setNome(nome);
		paciente.setIdade(idade);
		paciente.setCpf(cpf);
		paciente.setSobrenome(sobrenome);

		pacienteDAO.inserirPaciente(paciente);

		String email = "entra21@teste.pfvvai";
		String telefone = "33377676";
		String celular = "478997382";
		
		Contato contato = new Contato();

		contato.setCelular(celular);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		contato.setPaciente(paciente);
	
		contatoDAO.inserirContato(contato);
		

	}

}