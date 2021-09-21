package modelo.entidade.contato;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidade.paciente.Paciente;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contato.class)
public abstract class Contato_ {

	public static volatile SingularAttribute<Contato, String> telefone;
	public static volatile SingularAttribute<Contato, Paciente> paciente;
	public static volatile SingularAttribute<Contato, String> celular;
	public static volatile SingularAttribute<Contato, Long> Id;
	public static volatile SingularAttribute<Contato, String> email;

	public static final String TELEFONE = "telefone";
	public static final String PACIENTE = "paciente";
	public static final String CELULAR = "celular";
	public static final String ID = "Id";
	public static final String EMAIL = "email";

}

