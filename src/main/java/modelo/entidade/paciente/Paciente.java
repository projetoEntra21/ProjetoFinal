package modelo.entidade.paciente;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.consulta.Consulta;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private long Id;

	@Column(name = "cpf_paciente", nullable = false, unique = true)
	private String cpf;

	@Column(name = "nome_paciente", length = 25, nullable = false, unique = false)
	private String nome;

	@Column(name = "email_paciente", length = 25, nullable = false, unique = true)
	private String email;

	@Column(name = "sobrenome_paciente", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "idade_paciente", nullable = false, unique = false)
	private long idade;

	@Column(name = "senha_paciente", nullable = false, unique = true)
	private String senha;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<Consulta> consultas;

	public Paciente() {
	}

	public Paciente(String nome) {

		setNome(nome);

	}

	public Paciente(long Id) {

		setId(Id);

	}

	public Paciente(String email, String cpf, String nome, String sobrenome, long idade, String senha) {

		setEmail(email);
		setCpf(cpf);
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		setSenha(senha);

	}

	public Paciente(String nome, String sobrenome, List<Consulta> consultas) {

		setSobrenome(sobrenome);
		setNome(nome);
		setConsultas(consultas);

	}

	public Paciente(String nome, String sobrenome) {

		setSobrenome(sobrenome);
		setNome(nome);

	}

	public Paciente(long Id, String cpf, String nome, String sobrenome, long idade) {

		setCpf(cpf);
		setId(Id);
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);

	}

	public void setId(long id) {
		this.Id = id;

	}

	public long getId() {
		return Id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;

	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
