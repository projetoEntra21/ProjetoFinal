package modelo.entidade.paciente;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.endereco.Endereco;
import modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "paciente")
public class Paciente extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private long Id;

	@Column(name = "cpf_paciente", nullable = false, unique = true)
	private String cpf;

	@Column(name = "nome_paciente", length = 25, nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome_paciente", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "idade_paciente", nullable = false, unique = false)
	private long idade;

	@Column(name = "senha_paciente", nullable = false, unique = true)
	private String senha;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paciente")
	private List<Consulta> consultas;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "endereco")
	private List<Endereco> endereco;
	
	public Paciente() {
	}

	public Paciente(String nome) {

		setNome(nome);

	}

	public Paciente(long Id) {

		setId(Id);

	}

	public Paciente(String cpf, String nome, String sobrenome, long idade, String senha) {

	
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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
