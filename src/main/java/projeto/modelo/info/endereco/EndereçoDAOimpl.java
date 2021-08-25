//package projeto.modelo.info.endereco;
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
//import projeto.modelo.entidade.paciente.Paciente;
//
//public class Endere�oDAOimpl implements Endere�oDAO {
//
//	public void inserirEndere�o(Endere�o endere�o) {
//
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.save(endere�o);
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
//	public void deletarEndere�o(Endere�o endere�o) {
//
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.delete(endere�o);
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
//	public void alterarRua(Endere�o endere�o) {
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.update(endere�o);
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
//	public void alterarCep(Endere�o endereco) {
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.update(endereco);
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
//	public void alterarNumero(Endere�o endereco) {
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.update(endereco);
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
//	public void alterarComplemento(Endere�o endereco) {
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.update(endereco);
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
//	public List<Endere�o> consultarEndere�o(Paciente paciente) {
//
//		Session sessao = null;
//		List<Endere�o> endere�o = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
//
//			CriteriaQuery<Endere�o> criteria = construtor.createQuery(Endere�o.class);
//			Root<Endere�o> raizEndere�o = criteria.from(Endere�o.class);
//
//			Join<Endere�o, Paciente> juncaoPaciente = raizEndere�o.join(Endere�o.paciente);
//			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncaoPaciente.get(Endere�o.class), paciente.getCpf()));
//
//			endere�o = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();
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
//		return endere�o;
//	}
//
//	private SessionFactory conectarBanco() {
//
//		Configuration configuracao = new Configuration();
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