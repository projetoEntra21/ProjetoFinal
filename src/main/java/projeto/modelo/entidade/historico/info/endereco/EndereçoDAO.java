package projeto.modelo.entidade.historico.info.endereco;

import java.util.List;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

public interface EndereçoDAO {

	public void inserirEndereço(Endereço endereço);

	public void deletarEndereço(Endereço endereço);

	public void alterarRua(Endereço endereco);

	public void alterarCep(Endereço endereco);

	public void alterarNumero(Endereço endereco);

	public void alterarComplemento(Endereço endereco);

	List<Endereço> consultarEndereço(Paciente paciente);

}
