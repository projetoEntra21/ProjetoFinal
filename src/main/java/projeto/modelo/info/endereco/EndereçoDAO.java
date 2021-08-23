package projeto.modelo.info.endereco;

import java.util.List;

import projeto.modelo.entidade.paciente.Paciente;

public interface EnderešoDAO {

	public void inserirEnderešo(Enderešo enderešo);

	public void deletarEnderešo(Enderešo enderešo);

	public void alterarRua(Enderešo endereco);

	public void alterarCep(Enderešo endereco);

	public void alterarNumero(Enderešo endereco);

	public void alterarComplemento(Enderešo endereco);

	List<Enderešo> consultarEnderešo(Paciente paciente);

}
