package projeto.modelo.entidade.historico.entidade.nutricionista;

import java.util.List;

public interface NutricionistaDAO {

	public void inserirNutricionista(Nutricionista nutricionista);

	public void deletarNutricionista(Nutricionista nutricionista);

	public void atualizarNutriocionista(Nutricionista nutricionista);
	
	Nutricionista recuperarNutricionista(Nutricionista nutricionista);
	
	List<Nutricionista> recuperarNutricionistas();

}
