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

		String nome = "Julia";
		String cpf = "142.425.634.80";
		String sobrenome = "Teste";
		int idade = 18;

		Paciente paciente = new Paciente();

		paciente.setCpf(cpf);
		paciente.setIdade(idade);
		paciente.setNome(sobrenome);
		paciente.setSobrenome(sobrenome);

		String nome1 = "Mauro";
		String sobrenome1 = "José";
		String cpnj = "36.152.690/0001-64";
		
		Nutricionista nutricionista = new Nutricionista();
		
		nutricionista.setCnpj(cpnj);
		nutricionista.setNome(nome1);
		nutricionista.setSobrenome(sobrenome1);
		
		
		paciente.adicionarNutricionista(nutricionista);
		
		nutricionistaDAO.cadastrarNutricionista(nutricionista);
		
		pacienteDAO.inserirPaciente(paciente);
		
		
	}

}