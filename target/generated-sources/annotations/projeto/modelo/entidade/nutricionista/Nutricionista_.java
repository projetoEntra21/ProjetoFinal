package projeto.modelo.entidade.nutricionista;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import projeto.modelo.entidade.paciente.Paciente;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Nutricionista.class)
public abstract class Nutricionista_ {

	public static volatile SingularAttribute<Nutricionista, Paciente> paciente;
	public static volatile SingularAttribute<Nutricionista, String> nome;
	public static volatile SingularAttribute<Nutricionista, Integer> Id;
	public static volatile SingularAttribute<Nutricionista, String> cnpj;
	public static volatile SingularAttribute<Nutricionista, String> sobrenome;

	public static final String PACIENTE = "paciente";
	public static final String NOME = "nome";
	public static final String ID = "Id";
	public static final String CNPJ = "cnpj";
	public static final String SOBRENOME = "sobrenome";

}

