package projeto.modelo.entidade.nutricionista;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import modelo.factory.conexao.ConexaoFactory;
import projeto.modelo.entidade.paciente.Paciente;

public class NutricionistaDAOimpl implements NutricionistaDAO {

	private ConexaoFactory fabrica;

	public NutricionistaDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void cadastrarNutricionista(Nutricionista nutricionista) {

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

	public List<Nutricionista> ConsultarNutricionistasPacientes(Paciente paciente) {

		Session sessao = null;
		List<Nutricionista> nutricionistas = null;

		try {

			sessao = ((SessionFactory) fabrica.getConexao()).openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Nutricionista> criteria = construtor.createQuery(Nutricionista.class);
			Root<Nutricionista> raizNutricionista = criteria.from(Nutricionista.class);

			// Join<Nutricionista, Paciente> juncaoPaciente =
			// raizNutricionista.join(Nutricionista_.paciente);
			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
			// criteria.where(construtor.equal(juncaoPaciente.get(Nutricionista.class),
			// paciente.getCpf()));

			nutricionistas = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();

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