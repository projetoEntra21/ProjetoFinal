package modelo.dao.contato;

import java.util.List;

import modelo.entidade.contato.Contato;

public interface ContatoDAO {

	public void inserirContato(Contato contato);

	public void deletarContato(Contato contato);

	public void atualizarContato(Contato contato);

	Contato recuperarContato(Contato contato);

	List<Contato> recuperarContatos();

}
