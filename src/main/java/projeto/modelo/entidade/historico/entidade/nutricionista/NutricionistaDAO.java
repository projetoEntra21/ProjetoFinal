package projeto.modelo.entidade.historico.entidade.nutricionista;

import java.util.List;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;


public interface NutricionistaDAO {
	
	
	public void cadastrarNutricionista(Nutricionista nutricionista);
	
	public void deletarNutricionista(Nutricionista nutricionista);
	
	List<Paciente> ConsultarPacientesNutricionista(Nutricionista nutricionista);
	

}
