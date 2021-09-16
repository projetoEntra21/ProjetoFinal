package modelo.factory.conexao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ConexaoFactory {
	
	public SessionFactory getConexao() {

		Configuration configuracao = new Configuration();

		configuracao.addAnnotatedClass(controle.execptions.IdadeINvalidaExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.CinturaInvalidadExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.DensidadeInvalidaExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.AlturaInvalidaExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.ImcInvalidoExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.PesoInvalidoExecption.class);
		configuracao.addAnnotatedClass(controle.execptions.QuadrilInvalidoException.class);
		configuracao.addAnnotatedClass(modelo.entidade.historico.Historico.class);
		configuracao.addAnnotatedClass(modelo.entidade.paciente.Paciente.class);
		configuracao.addAnnotatedClass(modelo.entidade.nutricionista.Nutricionista.class);
		configuracao.addAnnotatedClass(modelo.entidade.consulta.Consulta.class);
		configuracao.addAnnotatedClass(modelo.entidade.contato.Contato.class);
	
		configuracao.configure("hibernate.cfg.xml");

		ServiceRegistry servico = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties())
				.build();

		SessionFactory fabricaSessao = configuracao.buildSessionFactory(servico);

		return fabricaSessao;
	}

}
