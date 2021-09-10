package projeto.modelo.entidade.historico.entidade.paciente;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import modelo.factory.conexao.ConexaoFactory;

public class PacienteDAOimpl<pubic> implements PacienteDAO {

	private ConexaoFactory fabrica;

	public PacienteDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirPaciente(Paciente paciente) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(paciente);

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

	public void deletarPaciente(Paciente paciente) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(paciente);

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

	public void atualizarPaciente(Paciente paciente) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(paciente);

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

	public Paciente recuperarPaciente(Paciente paciente) {

		Session sessao = null;
		Paciente pacienteRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Paciente> criteria = construtor.createQuery(Paciente.class);
			Root<Paciente> raizPaciente = criteria.from(Paciente.class);

			criteria.select(raizPaciente);

			ParameterExpression<Long> idPaciente = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizPaciente.get("id"), idPaciente));

			pacienteRecuperado = sessao.createQuery(criteria).setParameter(idPaciente, paciente.getId())
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

		return pacienteRecuperado;
	}

	public List<Paciente> recuperarPacientes() {

		Session sessao = null;
		List<Paciente> pacientes = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Paciente> criteria = construtor.createQuery(Paciente.class);
			Root<Paciente> raizPaciente = criteria.from(Paciente.class);

			criteria.select(raizPaciente);

			pacientes = sessao.createQuery(criteria).getResultList();

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

		return pacientes;
	}
}