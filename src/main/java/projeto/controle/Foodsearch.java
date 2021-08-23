package projeto.controle;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Foodsearch {

	public String api(String url) throws IOException {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url(url).build();

		Response response = null;

		try {
			response = client.newCall(request).execute();
		} catch (IOException erro) {
			erro.printStackTrace();
		}

		return response.body().string();

	}
}
