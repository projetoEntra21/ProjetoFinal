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
//public class EndereçoDAOimpl implements EndereçoDAO {
//
//	public void inserirEndereço(Endereço endereço) {
//
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.save(endereço);
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
//	public void deletarEndereço(Endereço endereço) {
//
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.delete(endereço);
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
//	public void alterarRua(Endereço endereço) {
//		org.hibernate.Session sessao = null;
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.update(endereço);
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
//	public void alterarCep(Endereço endereco) {
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
//	public void alterarNumero(Endereço endereco) {
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
//	public void alterarComplemento(Endereço endereco) {
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
//	public List<Endereço> consultarEndereço(Paciente paciente) {
//
//		Session sessao = null;
//		List<Endereço> endereço = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
//
//			CriteriaQuery<Endereço> criteria = construtor.createQuery(Endereço.class);
//			Root<Endereço> raizEndereço = criteria.from(Endereço.class);
//
//			Join<Endereço, Paciente> juncaoPaciente = raizEndereço.join(Endereço.paciente);
//			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncaoPaciente.get(Endereço.class), paciente.getCpf()));
//
//			endereço = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();
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
//		return endereço;
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