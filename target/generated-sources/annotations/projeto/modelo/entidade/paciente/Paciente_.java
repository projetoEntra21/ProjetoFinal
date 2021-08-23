package projeto.modelo.entidade.paciente;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import projeto.modelo.entidade.nutricionista.Nutricionista;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ {

	public static volatile ListAttribute<Paciente, Nutricionista> nutricionista;
	public static volatile SingularAttribute<Paciente, Integer> idade;
	public static volatile SingularAttribute<Paciente, Paciente> paciente;
	public static volatile SingularAttribute<Paciente, String> cpf;
	public static volatile SingularAttribute<Paciente, String> nome;
	public static volatile SingularAttribute<Paciente, Integer> Id;
	public static volatile SingularAttribute<Paciente, String> sobrenome;
	public static volatile SingularAttribute<Paciente, Integer> id_endereço_paciente;
	public static volatile SingularAttribute<Paciente, Integer> id_contato_paciente;

	public static final String NUTRICIONISTA = "nutricionista";
	public static final String IDADE = "idade";
	public static final String PACIENTE = "paciente";
	public static final String CPF = "cpf";
	public static final String NOME = "nome";
	public static final String ID = "Id";
	public static final String SOBRENOME = "sobrenome";
	public static final String ID_ENDEREÇO_PACIENTE = "id_endereço_paciente";
	public static final String ID_CONTATO_PACIENTE = "id_contato_paciente";

}

