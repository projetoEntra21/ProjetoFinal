//package projeto.modelo.entidade.nutricionista;
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
//public class NutricionistaDAOimpl implements NutricionistaDAO {
//
//	public void cadastrarNutricionista(Nutricionista nutricionista) {
//
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.save(nutricionista);
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
//	public void deletarNutricionista(Nutricionista nutricionista) {
//
//		org.hibernate.Session sessao = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			sessao.delete(nutricionista);
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
//	public List<Nutricionista> ConsultarNutricionistasPacientes(Paciente paciente) {
//
//
//		Session sessao = null;
//		List<Nutricionista> nutricionistas = null;
//
//		try {
//
//			sessao = ((SessionFactory) conectarBanco()).openSession();
//			sessao.beginTransaction();
//
//			CriteriaBuilder construtor = sessao.getCriteriaBuilder();
//
//			CriteriaQuery<Nutricionista> criteria = construtor.createQuery(Nutricionista.class);
//			Root<Nutricionista> raizNutricionista = criteria.from(Nutricionista.class);
//
//			Join<Nutricionista, Paciente> juncaoPaciente = raizNutricionista.join(Nutricionista_.paciente);
//			ParameterExpression<String> cpfPaciente = construtor.parameter(String.class);
//			criteria.where(construtor.equal(juncaoPaciente.get(Nutricionista.class), paciente.getCpf()));
//
//			nutricionistas = sessao.createQuery(criteria).setParameter(cpfPaciente, paciente.getCpf()).getResultList();
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
//		return nutricionistas;
//	}
//
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