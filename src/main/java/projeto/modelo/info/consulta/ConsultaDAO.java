package projeto.modelo.info.consulta;

public interface ConsultaDAO {
	
	public void inserirConsulta(Consulta consulta);

	public void deletarConsulta(Consulta consulta);
	
	public void atualizarDia(Consulta consulta);
	
	public void atualizarHora(Consulta consulta);

	
	
}
