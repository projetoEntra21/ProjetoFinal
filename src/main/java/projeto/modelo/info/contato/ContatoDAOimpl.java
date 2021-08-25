//package projeto.modelo.info.contato;
//
//import java.util.List;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Join;
//import javax.persistence.criteria.ParameterExpression;
//import javax.persistence.criteria.Root;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
//import projeto.modelo.entidade.nutricionista.Nutricionista;
//import projeto.modelo.entidade.paciente.Paciente;
//
//
//public class ContatoDAOimpl implements ContatoDAO {
//
//	public void inserirContato(Contato contato) {
//
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = conectarBanco().openSession();
//			sessao.beginTransaction();
//
//			sessao.save(contato);
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//	}
//	public void deletarContato(Contato contato) {
//
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = conectarBanco().openSession();
//			sessao.beginTransaction();
//
//			sessao.delete(contato);
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//	}
//
//	public void novoEmail(Contato contato, String novoEmail) {
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = conectarBanco().openSession();
//			sessao.beginTransaction();
//
//			sessao.update(contato);
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//	}
//	
//	public void novoTelefone(Contato contato, String novoTelefone) {
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = conectarBanco().openSession();
//			sessao.beginTransaction();
//
//			sessao.update(contato);
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//	}
//
//
//	public void novoCelular(Contato contato, String novoCelular) {
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = conectarBanco().openSession();
//			sessao.beginTransaction();
//
//			sessao.update(contato);
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//	}
//	
//	public List<Contato> consultarContato(Paciente paciente) {
//
//		Session sessao = null;
//		List<Contato> contatos = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
//
//			CriteriaQuery<Contato> criteria = construtor.createQuery(Contato.class);
//			Root<Contato> raizContato = criteria.from(Contato.class);
//
//			Join<Contato, Paciente> juncaoPaciente = raizContato.join(Contato_.paciente);
//			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncaoPaciente.get(Nutricionista.class), paciente.getCpf()));
//
//			contatos = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();
//
//			sessao.getTransaction().commit();
//
//		} catch (Exception sqlException) {
//
//			sqlException.printStackTrace();
//
//			if (sessao.getTransaction() != null) {
//				sessao.getTransaction().rollback();
//			}
//
//		} finally {
//
//			if (sessao != null) {
//				sessao.close();
//			}
//		}
//
//		return contatos;
//	}
//
//	private SessionFactory conectarBanco() {
//
//		Configuration configuracao = new Configuration();
//
//
//		configuracao.addAnnotatedClass(projeto.controle.execptions.IdadeINvalidaExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.CinturaInvalidadExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.DensidadeInvalidaExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.AlturaInvalidaExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.ImcInvalidoExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.PesoInvalidoExecption.class);
//		configuracao.addAnnotatedClass(projeto.controle.execptions.QuadrilInvalidoException.class);
//		configuracao.addAnnotatedClass(projeto.modelo.Historico.class);
//		configuracao.addAnnotatedClass(projeto.modelo.entidade.paciente.Paciente.class);
//		configuracao.addAnnotatedClass(projeto.modelo.entidade.nutricionista.Nutricionista.class);
//		configuracao.addAnnotatedClass(projeto.modelo.info.consulta.Consulta.class);
//		configuracao.addAnnotatedClass(projeto.modelo.info.contato.Contato.class);
//		configuracao.configure("scr/main/hibernate.cfg.xml");
//
//		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
//				.build();
//
//		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);
//
//		return fabricaSessao;
//	}
//}