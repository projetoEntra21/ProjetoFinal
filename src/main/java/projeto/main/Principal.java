package projeto.main;

public class Principal {

	public static void main(String[] args) {
	
		
		String jsonString = ("https://api.edamam.com/api/food-database/v2/parser?app_id=0ade5519&app_key=765cf001c347b17087e6af924d562b33&nutrition-type=cooking");
		JSONObject obj = new JSONObject(jsonString);
		String pageName = obj.getJSONObject("pageInfo").getString("pageName");

		JSONArray arr = obj.getJSONArray("alimento"); // notice that `"posts": [...]`
		for (int i = 0; i < arr.length(); i++) {
			String post_id = arr.getJSONObject(i).getString("Alimento");

		
		
	}

}
