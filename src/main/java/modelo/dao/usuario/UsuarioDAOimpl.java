package modelo.dao.usuario;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.nutricionista.Nutricionista;
import modelo.entidade.paciente.Paciente;
import modelo.entidade.usuario.Usuario;
import modelo.factory.conexao.ConexaoFactory;

public class UsuarioDAOimpl implements UsuarioDAO {

	private ConexaoFactory fabrica;

	public UsuarioDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirUsuario(Usuario usuario) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(usuario);

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

	public void deletarUsuario(Usuario usuario) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(usuario);

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

	public void atualizarUsuario(Usuario usuario) {
		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(usuario);

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

	public Usuario recuperarUsuarioPeloNome(Usuario usuario) {
		Session sessao = null;
		Usuario usuarioRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizUsuario = criteria.from(Usuario.class);

			criteria.select(raizUsuario);

			ParameterExpression<String> nomeUsuario = construtor.parameter(String.class);
			criteria.where(construtor.equal(raizUsuario.get("nome_usuario"), nomeUsuario));

			usuarioRecuperado = sessao.createQuery(criteria).setParameter(nomeUsuario, usuario.getNome())
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

		return usuarioRecuperado;
	}
	
	public Usuario recuperarUsuario(Usuario usuario) {

		Session sessao = null;
		Usuario UsuarioRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizPaciente = criteria.from(Usuario.class);

			criteria.select(raizPaciente);

			ParameterExpression<Long> idUsuario = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizPaciente.get("id"), idUsuario));

			UsuarioRecuperado = sessao.createQuery(criteria).setParameter(idUsuario, usuario.getId())
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

		return UsuarioRecuperado;
	}

	public List<Usuario> recuperarUsuarios() {
		Session sessao = null;
		List<Usuario> usuarios = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizUsuario = criteria.from(Usuario.class);

			criteria.select(raizUsuario);

			usuarios = sessao.createQuery(criteria).getResultList();

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

		return usuarios;
	}

	public Usuario recuperarUsuarioPeloSobrenome(Usuario usuario) {
		Session sessao = null;
		Usuario usuarioRecuperado = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizUsuario = criteria.from(Usuario.class);

			criteria.select(raizUsuario);

			ParameterExpression<String> id = construtor.parameter(String.class);
			criteria.where(construtor.equal(raizUsuario.get("id_usuario"), id));

			usuarioRecuperado = sessao.createQuery(criteria).setParameter(id, usuario.getSobrenome())
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

		return usuarioRecuperado;
	}

	public Usuario recuperarUsuarioLoginSenha(Usuario usuario) {
		
		Session sessao = null;
		Usuario usuarioRecuperado = null;
		
		        try {
		    		sessao = fabrica.getConexao().openSession();
		            sessao.beginTransaction();
		            
		            CriteriaBuilder construtor = sessao.getCriteriaBuilder();
		            CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
		            Root<Usuario> raizUsuario = criteria.from(Usuario.class);
		            criteria.select(raizUsuario);

		            ParameterExpression<String> loginUsuario = construtor.parameter(String.class);
		            criteria.where(construtor.equal(raizUsuario.get("login"), loginUsuario));
		            usuarioRecuperado = sessao.createQuery(criteria).setParameter(loginUsuario, usuario.getLogin()).getSingleResult();
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
		        return usuarioRecuperado;
		    }

	public List<Usuario> recuperarUsuariosPorId(Usuario usuario) {
		Session sessao = null;
		List<Usuario> usuarios = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			CriteriaBuilder construtor = sessao.getCriteriaBuilder();

			CriteriaQuery<Usuario> criteria = construtor.createQuery(Usuario.class);
			Root<Usuario> raizUsuario = criteria.from(Usuario.class);

			criteria.select(raizUsuario);

			ParameterExpression<Long> id = construtor.parameter(Long.class);
			criteria.where(construtor.equal(raizUsuario.get("id_usuario"), id));

			usuarios = (List<Usuario>) sessao.createQuery(criteria).setParameter(id, usuario.getId()).getSingleResult();

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

		return usuarios;
	}
}