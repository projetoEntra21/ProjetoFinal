package modelo.dao.usuario;

import java.util.List;

import modelo.entidade.usuario.Usuario;

public interface UsuarioDAO {

	public void inserirUsuario(Usuario usuario);

	public void deletarUsuario(Usuario usuario);

	public void atualizarUsuario(Usuario usuario);

	Usuario recuperarUsuario(Usuario usuario);

	List<Usuario> recuperarUsuarios();
}
