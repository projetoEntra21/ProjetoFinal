package projeto.modelo.entidade.nutricionista;

import java.util.List;

import projeto.modelo.entidade.paciente.Paciente;


public interface NutricionistaDAO {
	
	
	public void cadastrarNutricionista(Nutricionista nutricionista);
	
	public void deletarNutricionista(Nutricionista nutricionista);
	
	List<Nutricionista> ConsultarNutricionistasPacientes(Paciente paciente);
	

}
