package projeto.main;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.paciente.Paciente;
import projeto.modelo.entidade.paciente.PacienteDAO;
import projeto.modelo.entidade.paciente.PacienteDAOimpl;

public class Principal {

	public static void main(String[] args) throws IdadeINvalidaExecption  {
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

		PacienteDAO pacienteDAO = new PacienteDAOimpl();

		pacienteDAO.inserirPaciente(new Paciente(454, 12, "11.645.099-52", "lucas", "bento", 16));

	}

}
