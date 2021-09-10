package projeto.modelo.entidade.historico.info.contato;

import java.util.List;

public interface ContatoDAO {

	public void inserirContato(Contato contato);

	public void deletarContato(Contato contato);

	public void atualizarContato(Contato contato);

	Contato recuperarContato(Contato contato);

	List<Contato> recuperarContatos();

}
