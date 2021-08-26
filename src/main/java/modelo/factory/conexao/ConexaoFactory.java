package modelo.factory.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ConexaoFactory {
	
	public SessionFactory getConexao() {

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
	
		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}

}
