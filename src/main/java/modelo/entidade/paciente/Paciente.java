package modelo.entidade.paciente;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereco;
import modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "paciente")
public class Paciente extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<Consulta> consultas;

	public Paciente() {
	}

	public Paciente(long id) {

		

	}
	

	public Paciente(long id, String nome, String sobrenome, String cpf, long idade, String login, String senha) {

		super(nome, sobrenome, cpf, idade, login, senha);

	}
	
	
	public Paciente(String nome, String sobrenome, String cpf, long idade, String login, String senha, Contato contato) {

		super(nome, sobrenome, cpf, idade, login, senha, contato);
	

	}

	

	public Paciente(String nome, String sobrenome) {

		super(nome, sobrenome);
		setConsultas(consultas);

	}
	
	public Paciente(String nome, String sobrenome, List<Consulta> consultas) {

		super(nome, sobrenome);
		setConsultas(consultas);

	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

}
