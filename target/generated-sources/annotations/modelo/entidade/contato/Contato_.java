package modelo.entidade.contato;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Contato.class)
public abstract class Contato_ {

	public static volatile SingularAttribute<Contato, String> telefone;
	public static volatile SingularAttribute<Contato, Long> id;
	public static volatile SingularAttribute<Contato, String> email;

	public static final String TELEFONE = "telefone";
	public static final String ID = "id";
	public static final String EMAIL = "email";

}

