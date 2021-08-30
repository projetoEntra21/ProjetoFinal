package projeto.modelo.entidade.historico.info.consulta;

import modelo.factory.conexao.ConexaoFactory;

import java.util.Objects;

import org.hibernate.Session;

public class ConsultaDAOimpl implements ConsultaDAO {

	private ConexaoFactory fabrica;

	public ConsultaDAOimpl() {
		fabrica = new ConexaoFactory();
	}

	@Override
	public void inserirConsulta(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.save(consulta);

			sessao.getTransaction().commit();

		} catch (Exception sql) {
			sql.printStackTrace();
		} finally {
			if (Objects.nonNull(sessao))
				sessao.close();
		}

	}

	@Override
	public void deletarConsulta(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.delete(consulta);

			sessao.getTransaction().commit();

		} catch (Exception sql) {
			sql.printStackTrace();
			// TODO: handle exception
		} finally {
			if (Objects.nonNull(sessao))
				sessao.close();
		}

	}

	@Override
	public void atualizarDia(Consulta consulta) {

		Session sessao = null;

		try {

			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(consulta);

			sessao.getTransaction().commit();

		} catch (Exception sql) {
			sql.printStackTrace();
			// TODO: handle exception
		} finally {
			if (Objects.nonNull(sessao))
				sessao.close();
		}

	}

	@Override
	public void atualizarHora(Consulta consulta) {

		Session sessao = null;

		try {
			sessao = fabrica.getConexao().openSession();
			sessao.beginTransaction();

			sessao.update(consulta);

			sessao.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(sessao))
				sessao.close();
		}

	}

}
