package projeto.main;

import org.json.JSONObject;

import projeto.modelo.entidade.food.FoodDAO;
import projeto.modelo.entidade.food.FoodDAOImpl;

public class Principal {

	public static void main(String[] args) {

		FoodDAO foodDAO = new FoodDAOImpl();

		JSONObject jsonObject = foodDAO.readJsonFromUrl(
				"https://api.edamam.com/api/food-database/v2/parser?app_id=0ade5519&app_key=765cf001c347b17087e6af924d562b33&ingr=pasta&nutrition-type=cooking");

		Object parsed = jsonObject.get("parsed");

		System.out.println(parsed);
	
		
		
		
		
	}

}
