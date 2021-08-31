package projeto.modelo.entidade.usuario;

import java.util.List;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

public interface UsuarioDAO {

	void inserirUsuario(Usuario usuario);

	void deletarUsuario(Usuario usuario);

	void atualizarContato(Usuario usuario);

	List<Usuario> recuperarUsuarios();



}
