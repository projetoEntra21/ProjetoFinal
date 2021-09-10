package projeto.modelo.entidade.historico;

import java.util.List;

public interface HistoricoDAO {

	void inserirHistorico(Historico historico);

	void deletarHistorico(Historico historico);

	public void atualizarHistorico(Historico historico);

	Historico recuperarHistorico(Historico historico);

	List<Historico> recuperarHistoricos();

}
