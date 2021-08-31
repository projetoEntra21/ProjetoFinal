package projeto.modelo.entidade.historico;

import java.sql.Date;
import java.util.List;

public interface HistoricoDAO {

	void inserirHistorico(Historico historico);

	void deletarHistorico(Historico historico);

	void atualizarId(Historico historico, int novoId);

	void atualizarPeso(Historico historico, float novoPeso);

	void atualizarAltura(Historico historico, float novoAltura);

	void atualizarQuadril(Historico historico, float novoQuadril);

	void atualizarCintura(Historico historico, float novoCintura);

	void atualizarImc(Historico historico, float novoImc);

	void atualizarDensidade(Historico historico, float novoDensidade);

	void atualizarHorario(Historico historico, Date novoHorario);

	List<Historico> recuperarHistoricos();

}
