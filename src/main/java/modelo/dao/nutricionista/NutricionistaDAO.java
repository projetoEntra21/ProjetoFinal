package modelo.dao.nutricionista;

import java.util.List;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.nutricionista.Nutricionista;

public interface NutricionistaDAO {

	public void inserirNutricionista(Nutricionista nutricionista);

	public void deletarNutricionista(Nutricionista nutricionista);

	public void atualizarNutriocionista(Nutricionista nutricionista);
	
	Nutricionista recuperarNutricionista(Nutricionista nutricionista);
	
	List<Nutricionista> recuperarNutricionistaPelaConsulta(Consulta consulta);
	
	List<Nutricionista> recuperarNutricionistas();

}
