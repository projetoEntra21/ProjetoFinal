package projeto.main;

import modelo.dao.nutricionista.NutricionistaDAO;
import modelo.dao.nutricionista.NutricionistaDAOimpl;
import modelo.entidade.nutricionista.Nutricionista;

public class Principal {

	public static void main(String[] args) {

//		Scanner leitor = new Scanner(System.in);
//
//		System.out.println("Digite um alimento: ");
//		String alimento = leitor.nextLine();
//
//		FoodDAO foodDAO = new FoodDAOimpl();
//
//		JSONObject jsonObject = foodDAO.readJsonFromUrl(
//				"https://api.edamam.com/api/food-database/v2/parser?app_id=0ade5519&app_key=765cf001c347b17087e6af924d562b33&ingr="
//						+ alimento + "&nutrition-type=cooking");
//
//		JSONObject food = jsonObject.getJSONArray("parsed").getJSONObject(0).getJSONObject("food");
//		double lucas = food.getJSONObject("nutrients").getDouble("ENERC_KCAL");
//
//		System.out.println(lucas);

//		EndereçoDAO endereçoDAO = new EndereçoDAOimpl();
//		PacienteDAO pacienteDAO = new PacienteDAOimpl();
//		ContatoDAO contatoDAO = new ContatoDAOimpl();
//		HistoricoDAO historicoDAO = new HistoricoDAOImpl();
		NutricionistaDAO nutricionistaDAO = new NutricionistaDAOimpl();
//		ConsultaDAO consultaDAO = new ConsultaDAOimpl();
//
//		String nome = "Pedro";
//		String sobrenome = "Fonseca";
//		String cpf = "957.893.123-59";
//		int idade = 16;
//
//		Paciente paciente = new Paciente();
//
//		paciente.setId(39);
//		paciente.setIdade(idade);
//		paciente.setNome(nome);
//		paciente.setCpf(cpf);
//		paciente.setSobrenome(sobrenome);
//
//		int hora = 13;
//		int minuto = 30;
//		int segundo = 00;
//		int ano = 2021;
//		int mes = 8;
//		int dia = 10;
//
//		LocalTime time = LocalTime.of(dia, minuto);
//
//		LocalDate date = LocalDate.of(2021, Month.AUGUST, 07);
//
//		Consulta consulta = new Consulta();
//		List<Consulta> consultas = new ArrayList<Consulta>();
//
//		consulta.setData(date);
//		consulta.setHora(time);
//
//		String nome1 = "Rogerio";
//		String cpnj = "17.604.856/0001-79";
//		String sobrenome1 = "Rodrigues";
//
//		Nutricionista nutricionista = new Nutricionista();
//		consulta.setNutricionista(nutricionista);
//		consulta.setPaciente(paciente);
//
//		nutricionista.setId(26);
//		nutricionista.setCnpj(cpnj);
//		nutricionista.setNome(nome1);
//		nutricionista.setSobrenome(sobrenome1);
//
//		consultas.add(consulta);
//
//		nutricionista.setConsultas(consultas);
//		paciente.setConsultas(consultas);
//
////		pacienteDAO.inserirPaciente(paciente);
//		consultaDAO.inserirConsulta(consulta);
////		nutricionistaDAO.cadastrarNutricionista(nutricionista);
		
		
		
		
//		nutricionistaDAO.inserirNutricionista(new Nutricionista("Gabriel", "Santos", "66.192.798/0001-29", "testesenha"));
		
		

	}

}
