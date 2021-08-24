package projeto.modelo.info.contato;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import modelo.factory.conexao.ConexaoFactory;
import projeto.modelo.entidade.paciente.Paciente;

public class ContatoDAOimpl implements ContatoDAO {

	private ConexaoFactory fabrica;

	public ContatoDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirContato(Contato contato) {

		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(contato);

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

	public void deletarContato(Contato contato) {

		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(contato);

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

	public void novoEmail(Contato contato, String novoEmail) {
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(contato);

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

	public void novoTelefone(Contato contato, String novoTelefone) {
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();
			sessao.update(contato);

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

	public void novoCelular(Contato contato, String novoCelular) {
		org.hibernate.Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(contato);

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

	public List<Contato> consultarContato(Paciente paciente) {

		Session sessao = null;
		List<Contato> contatos = null;

		try {
			sessao = ((SessionFactory) fabrica.getConexao()).openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Contato> criteria = construtor.createQuery(Contato.class);
			Root<Contato> raizContato = criteria.from(Contato.class);

			// Join<Contato, Paciente> juncaoPaciente = raizContato.join(Contato_.paciente);
			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
			// criteria.where(construtor.equal(juncaoPaciente.get(Nutricionista.class),
			// paciente.getCpf()));

			contatos = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();

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

		return contatos;
	}
}