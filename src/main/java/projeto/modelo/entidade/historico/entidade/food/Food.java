
package projeto.modelo.entidade.historico.entidade.food;

public class Food {

	float servingsPerContainer;
	String foodId;
	String categoryLabel;
	String label;
	String category;
	float[] nutrients;

	public String ShowAsString() {

		return "Alimento [" + servingsPerContainer + ", " + foodId + ", " + categoryLabel + ", " + label + ","
				+ category + "," + nutrients + "]";
	}
}