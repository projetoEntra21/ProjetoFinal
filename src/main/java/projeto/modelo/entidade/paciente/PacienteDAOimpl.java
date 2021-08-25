package projeto.modelo.entidade.paciente;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class PacienteDAOimpl implements PacienteDAO {

	public void inserirPaciente(Paciente paciente) {

		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarId(Paciente paciente, int novoId) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarIdEnderecoPaciente(Paciente paciente, int novoIdEnderecoPaciente) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarIdContatoPaciente(Paciente paciente, int novoIdContatoPaciente) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarCpf(Paciente paciente, String novoCpf) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarNome(Paciente paciente, String novoNome) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarSobreNome(Paciente paciente, String novoSobreNome) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	public void atualizarIdade(Paciente paciente, int novoIdade) {
		org.hibernate.Session sessao = null;

		try {

			sessao = ((SessionFactory) conectarBanco()).openSession();
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

	private SessionFactory conectarBanco() {

		Configuration configuracao = new Configuration();


		configuracao.addAnnotatedClass(projeto.controle.execptions.IdadeINvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.CinturaInvalidadExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.DensidadeInvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.AlturaInvalidaExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.ImcInvalidoExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.PesoInvalidoExecption.class);
		configuracao.addAnnotatedClass(projeto.controle.execptions.QuadrilInvalidoException.class);
		configuracao.addAnnotatedClass(projeto.modelo.Historico.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.paciente.Paciente.class);
		configuracao.addAnnotatedClass(projeto.modelo.entidade.nutricionista.Nutricionista.class);
		configuracao.addAnnotatedClass(projeto.modelo.info.consulta.Consulta.class);
		configuracao.addAnnotatedClass(projeto.modelo.info.contato.Contato.class);
		configuracao.configure("src/main/java/resources/hibernate.cfg.xml");

		StandardServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}
}