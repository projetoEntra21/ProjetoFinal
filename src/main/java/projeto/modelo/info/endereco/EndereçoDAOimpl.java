package projeto.modelo.info.endereco;

import modelo.factory.conexao.ConexaoFactory;

public class EndereçoDAOimpl implements EndereçoDAO {

	private ConexaoFactory fabrica;

	public EndereçoDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	public void inserirEndereço(Endereço endereço) {

		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(endereço);

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

	public void deletarEndereço(Endereço endereço) {

		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(endereço);

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

	public void alterarRua(Endereço endereço) {
		org.hibernate.Session sessao = null;
		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(endereço);

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

	public void alterarCep(Endereço endereco) {
		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(endereco);

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

	public void alterarNumero(Endereço endereco) {
		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(endereco);

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

	public void alterarComplemento(Endereço endereco) {
		org.hibernate.Session sessao = null;
		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(endereco);

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
}