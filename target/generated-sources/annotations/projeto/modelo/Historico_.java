package projeto.modelo;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import projeto.modelo.entidade.paciente.Paciente;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Historico.class)
public abstract class Historico_ {

	public static volatile SingularAttribute<Historico, Float> cintura;
	public static volatile SingularAttribute<Historico, Float> densidade;
	public static volatile SingularAttribute<Historico, Float> quadril;
	public static volatile SingularAttribute<Historico, Date> horario;
	public static volatile SingularAttribute<Historico, Float> peso;
	public static volatile SingularAttribute<Historico, Float> altura;
	public static volatile SingularAttribute<Historico, Paciente> paciente;
	public static volatile SingularAttribute<Historico, Integer> Id;
	public static volatile SingularAttribute<Historico, Float> imc;

	public static final String CINTURA = "cintura";
	public static final String DENSIDADE = "densidade";
	public static final String QUADRIL = "quadril";
	public static final String HORARIO = "horario";
	public static final String PESO = "peso";
	public static final String ALTURA = "altura";
	public static final String PACIENTE = "paciente";
	public static final String ID = "Id";
	public static final String IMC = "imc";

}

