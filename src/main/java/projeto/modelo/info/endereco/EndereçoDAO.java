package projeto.modelo.info.endereco;

import java.util.List;

import projeto.modelo.entidade.paciente.Paciente;

public interface Endere�oDAO {

	public void inserirEndere�o(Endere�o endere�o);

	public void deletarEndere�o(Endere�o endere�o);

	public void alterarRua(Endere�o endereco);

	public void alterarCep(Endere�o endereco);

	public void alterarNumero(Endere�o endereco);

	public void alterarComplemento(Endere�o endereco);

	List<Endere�o> consultarEndere�o(Paciente paciente);

}
