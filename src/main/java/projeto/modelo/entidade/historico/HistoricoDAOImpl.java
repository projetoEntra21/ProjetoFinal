package projeto.modelo.entidade.historico;

import java.sql.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HistoricoDAOImpl implements HistoricoDAO {

	public void inserirHistorico(Historico historico) {

		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.save(historico);

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

	public void deletarHistorico(Historico historico) {

		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.delete(historico);

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

	public void atualizarId(Historico historico, int novoId) {

		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarPeso(Historico historico, float novoPeso) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarAltura(Historico historico, float novoAltura) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarQuadril(Historico historico, float novoQuadril) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarCintura(Historico historico, float novoCintura) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarImc(Historico historico, float novoImc) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarDensidade(Historico historico, float novoDensidade) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public void atualizarHorario(Historico historico, Date novoHorario) {
		org.hibernate.Session sessao = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			sessao.update(historico);

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

	public List<Historico> recuperarHistoricos() {

		org.hibernate.Session sessao = null;
		List<Historico> historicos = null;

		try {

			sessao = conectarBanco().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Historico> criteria = construtor.createQuery(Historico.class);
			Root<Historico> raizHistorico = criteria.from(Historico.class);

			criteria.select(raizHistorico);

			historicos = sessao.createQuery(criteria).getResultList();

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

		return historicos;
	}

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();


		configuracao.addAnnotatedClass(projeto.controle.execptions.IdadeINvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.CinturaInvalidadExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.DensidadeInvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.AlturaInvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.ImcInvalidoExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.PesoInvalidoExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.QuadrilInvalidoException.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.historico.Historico.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.historico.entidade.paciente.Paciente.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.historico.info.consulta.Consulta.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.historico.info.contato.Contato.class);
		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}
}