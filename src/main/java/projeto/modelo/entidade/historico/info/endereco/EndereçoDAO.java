package projeto.modelo.entidade.historico.info.endereco;

import java.util.List;

public interface EndereçoDAO {

	public void inserirEndereço(Endereço endereço);

	public void deletarEndereço(Endereço endereço);

	public void atualizarEndereço(Endereço endereço);
	
	Endereço recuperarEndereço(Endereço endereço);

	List<Endereço> recuperarEndereços();

}
