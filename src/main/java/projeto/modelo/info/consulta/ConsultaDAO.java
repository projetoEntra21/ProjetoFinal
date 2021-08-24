package projeto.modelo.info.consulta;

import java.util.List;

import projeto.modelo.entidade.paciente.Paciente;

public interface ConsultaDAO {

	public void inserirConsulta(Consulta consulta);

	public void deletarConsulta(Consulta consulta);

	public void atualizarDia(Consulta consulta);

	public void atualizarHora(Consulta consulta);

	List<Consulta> recuperarConsultas();

	List<Consulta> ConsultarConsultasPaciente(Consulta consulta, Paciente paciente);

}
