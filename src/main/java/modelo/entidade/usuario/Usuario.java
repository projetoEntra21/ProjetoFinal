package modelo.entidade.usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.consulta.Consulta;
import modelo.entidade.contato.Contato;
import modelo.entidade.endereco.Endereco;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	protected Long id;
	
	@Column(name = "nome_usuario", length = 45, nullable = false, unique = false)
	protected String nome;
	
	@Column(name = "sobrenome_usuario", length = 45, nullable = false, unique = false)
	protected String sobrenome;
	
	@Column(name = "cpf_usuario", length = 14, nullable = false, unique = true)
	protected String cpf;
	
	@Column(name = "idade_usuario", nullable = false, unique = false)
	protected long idade;

	@Column(name = "login_usuario", length = 45, nullable = false, unique = true)
	protected String login;

	@Column(name = "senha_usuario", length = 45, nullable = false, unique = false)
	protected String senha;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "endereco")
	protected List<Endereco> enderecos;
	
	public Usuario() {}

	public Usuario(Long id) {

		this.id = id;

	}
	
	public Usuario(String nome, String sobrenome, String cpf, long idade, String login, String senha, List<Endereco> enderecos) {
		super();
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
		this.login = login;
		this.senha = senha;
		
	
	}
	
	public Usuario(String nome, String sobrenome, String cpf, long idade, String login, String senha) {
		super();
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
		this.login = login;
		this.senha = senha;
		
	}
	
	public Usuario(String nome, String sobrenome) {
		super();
		
		this.nome = nome;
		this.sobrenome = sobrenome;
	
	}
	
	public Usuario(String nome) {
		super();
		
		this.nome = nome;
	
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}


	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

}
