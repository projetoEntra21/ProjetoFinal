package projeto.modelo.entidade.historico.info.contato;

import java.util.List;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

public interface ContatoDAO {
	
	
	public void inserirContato(Contato contato);
	
	public void deletarContato(Contato contato);
	
	public void novoEmail(Contato contato, String novoEmail);
	
	public void novoTelefone(Contato contato, String novoTelefone);
	
	public void novoCelular(Contato contato, String novoCelular);

	List<Contato> consultarContato(Paciente paciente);
	

}
