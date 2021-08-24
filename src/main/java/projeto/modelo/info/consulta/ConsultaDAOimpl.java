package projeto.modelo.info.consulta;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import modelo.factory.conexao.ConexaoFactory;
import projeto.modelo.entidade.paciente.Paciente;

public class ConsultaDAOimpl implements ConsultaDAO {

	private ConexaoFactory fabrica;

	public ConsultaDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirConsulta(Consulta consulta) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(consulta);

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

	public void deletarConsulta(Consulta consulta) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(consulta);

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

	public void atualizarDia(Consulta consulta) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(consulta);

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

	public void atualizarHora(Consulta consulta) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(consulta);

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

	public List<Consulta> recuperarConsultas() {
		Session sessao = null;
		List<Consulta> consultas = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Consulta> criteria = construtor.createQuery(Consulta.class);
			Root<Consulta> raizEndereco = criteria.from(Consulta.class);

			criteria.select(raizEndereco);

			consultas = sessao.createQuery(criteria).getResultList();

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

		return consultas;
	}

	public List<Consulta> ConsultarConsultasPaciente(Consulta consulta, Paciente paciente) {
		Session sessao = null;
		List<Consulta> consultas = null;

		try {

			sessao = ((SessionFactory) fabrica.getConexao()).openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Consulta> criteria = construtor.createQuery(Consulta.class);
			Root<Consulta> raizConsulta = criteria.from(Consulta.class);

			// Join<Consulta, Paciente> juncaoPaciente =
			// raizConsulta.join(Consulta.paciente);
			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
			// criteria.where(construtor.equal(juncaoPaciente.get(Nutricionista.class),
			// paciente.getCpf()));

			consultas = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();

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

		return consultas;
	}
}