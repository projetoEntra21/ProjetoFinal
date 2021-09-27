package modelo.entidade.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import modelo.entidade.contato.Contato;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_paciente")
	private Long id;

	@Column(name = "login_usuario", length = 45, nullable = false, unique = true)
	private String login;

	@Column(name = "senha_usuario", length = 45, nullable = false, unique = false)
	private String senha;

	@Column
	private Contato contato;

	public Usuario() {}

	public Usuario(String login, String senha) {

		this.login = login;
		this.senha = senha;
	}

	public Usuario(Long id) {

		this.id = id;

	}

	public Usuario(Long id, String login, String senha) {
		this.id = id;
		this.login = login;
		this.senha = senha;
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

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
