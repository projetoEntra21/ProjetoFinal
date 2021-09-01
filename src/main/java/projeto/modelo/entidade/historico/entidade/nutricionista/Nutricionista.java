package projeto.modelo.entidade.historico.entidade.nutricionista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nutricionista")
	private int Id;

	@Column(name = "nome_nutricionista", length = 20, nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome_nutricionista", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "cnpj_nutricionista", length = 14, nullable = false, unique = true)
	private String cnpj;

	@ManyToMany(mappedBy = "nutricionistas")
	private List<Paciente> pacientes = new ArrayList<Paciente>();

	public Nutricionista() {
	}

	public Nutricionista(String nome, String sobrenome, String cpnj) {

		setNome(nome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public Nutricionista(int Id, String nome, String sobrenome, String cpnj) {
		setId(Id);
		setNome(sobrenome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void adicionarPacientes(Paciente pacientes) {
		this.pacientes.add(pacientes);
	}

}
