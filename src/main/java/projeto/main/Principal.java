package projeto.main;

import java.util.Scanner;

import org.json.JSONObject;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.historico.entidade.food.FoodDAO;
import projeto.modelo.entidade.historico.entidade.food.FoodDAOImpl;

public class Principal {

	public static void main(String[] args) throws IdadeINvalidaExecption {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um alimento: ");
		String alimento = leitor.nextLine();

		FoodDAO foodDAO = new FoodDAOImpl();

		JSONObject jsonObject = foodDAO.readJsonFromUrl(
				"https://api.edamam.com/api/food-database/v2/parser?app_id=0ade5519&app_key=765cf001c347b17087e6af924d562b33&ingr="
						+ alimento + "&nutrition-type=cooking");

		JSONObject food = jsonObject.getJSONArray("parsed").getJSONObject(0).getJSONObject("food");
		double lucas = food.getJSONObject("nutrients").getDouble("FAT");

		System.out.println(lucas);

	}

}