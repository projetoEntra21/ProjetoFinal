package projeto.modelo.entidade.historico.info.consulta;

import java.util.List;

public interface ConsultaDAO {

	public void inserirConsulta(Consulta consulta);

	public void deletarConsulta(Consulta consulta);

	public void atualizarConsulta(Consulta consulta);

	Consulta recuperarConsulta(Consulta consulta);

	List<Consulta> recuperarConsultas();

}
