package modelo.entidade.nutricionista;

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

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nutricionista")
	private Long Id;

	@Column(name = "nome_nutricionista", length = 20, nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome_nutricionista", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "cnpj_nutricionista", length = 14, nullable = false, unique = true)
	private String cnpj;

	@Column(name = "senha_nutricionista", nullable = false, unique = true)
	private String senha;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nutricionista")
	private List<Consulta> consultas;

	public Nutricionista() {
	}

	public Nutricionista(Long Id) {
		setId(Id);

	}

	public Nutricionista(Long Id, List<Consulta> consultas) {

		setId(Id);
		setConsultas(consultas);

	}

	public Nutricionista(String nome, String sobrenome, String cpnj, List<Consulta> consultas) {

		setConsultas(consultas);
		setNome(nome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public Nutricionista(String nome, String sobrenome, String cpnj, String senha) {

		setSenha(senha);
		setNome(nome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public Nutricionista(Long Id, String nome, String sobrenome, String cpnj, String senha) {

		setSenha(senha);
		setId(Id);
		setNome(sobrenome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public Long getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

}
