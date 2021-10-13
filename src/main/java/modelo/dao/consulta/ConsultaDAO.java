package modelo.dao.consulta;

import java.util.List;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;

public interface ConsultaDAO {

	public Consulta inserirConsulta(Consulta consulta);

	public void deletarConsulta(Consulta consulta);

	public void atualizarConsulta(Consulta consulta);

	Consulta recuperarConsulta(Consulta consulta);
	
	List<Consulta>recuperarConsultasPeloNutricionista(Nutricionista nutricionista);
	
	List<Consulta>recuperarConsultasPeloPaciente(Paciente paciente);

	List<Consulta> recuperarConsultas();

}
