package projeto.modelo.entidade.historico.entidade.nutricionista;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import modelo.factory.conexao.ConexaoFactory;

public class NutricionistaDAOimpl implements NutricionistaDAO {

	private ConexaoFactory fabrica;

	public NutricionistaDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirNutricionista(Nutricionista nutricionista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(nutricionista);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void deletarNutricionista(Nutricionista nutricionista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(nutricionista);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public void atualizarNutriocionista(Nutricionista nutricionista) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(nutricionista);

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}
	}

	public Nutricionista recuperarNutricionista(Nutricionista nutricionista) {

		Session sessao = null;
		Nutricionista nutricionistaRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Nutricionista> criteria = construtor.createQuery(Nutricionista.class);
			Root<Nutricionista> raizNutricionista = criteria.from(Nutricionista.class);

			criteria.select(raizNutricionista);

			ParameterExpression<Long> idNutricionista = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizNutricionista.get("id"), idNutricionista));

			nutricionistaRecuperado = sessao.createQuery(criteria).setParameter(idNutricionista, nutricionista.getId())
					.getSingleResult();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return nutricionistaRecuperado;
	}

	public List<Nutricionista> recuperarNutricionistas() {

		Session sessao = null;
		List<Nutricionista> nutricionistas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Nutricionista> criteria = construtor.createQuery(Nutricionista.class);
			Root<Nutricionista> raizNutricionista = criteria.from(Nutricionista.class);

			criteria.select(raizNutricionista);

			nutricionistas = sessao.createQuery(criteria).getResultList();

			sessao.getTransaction().commit();

		} catch (Exception sqlException) {

			sqlException.printStackTrace();

			if (sessao.getTransaction() != null) {
				sessao.getTransaction().rollback();
			}

		} finally {

			if (sessao != null) {
				sessao.close();
			}
		}

		return nutricionistas;
	}
}