package projeto.modelo.entidade.usuario;

import java.util.List;

public interface UsuarioDAO {

	public void inserirUsuario(Usuario usuario);

	public void deletarUsuario(Usuario usuario);

	public void atualizarUsuario(Usuario usuario);

	Usuario recuperarUsuario(Usuario usuario);
	
	List<Usuario> recuperarUsuarios();



}
