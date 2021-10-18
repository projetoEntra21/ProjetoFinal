package modelo.dao.endereco;

import java.util.List;

import modelo.entidade.endereco.Endereco;
import modelo.entidade.paciente.Paciente;
import modelo.entidade.usuario.Usuario;

public interface EnderecoDAO {

	public Endereco inserirEndereco(Endereco endereco);

	public void deletarEndereco(Endereco endereco);

	public void atualizarEndereco(Endereco endereco);

	Endereco recuperarEndereco(Endereco endereco);

	List<Endereco> recuperarEnderecoPeloPaciente(Usuario usuario);
	
	List<Endereco> recuperarEnderecos();

}
