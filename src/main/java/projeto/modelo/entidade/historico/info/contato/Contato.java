package projeto.modelo.entidade.historico.info.contato;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "contatos")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_consulta")
	private Long Id;

	@Column(name = "email_contatos", length = 40, nullable = false, unique = true)
	private String email;

	@Column(name = "telefone_contatos", length = 8, nullable = false, unique = true)
	private String telefone;

	@Column(name = "celular_contatos", length = 11, nullable = false, unique = true )
	private String celular;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Contato() {
	}

	public Contato(Long id, String email, String telefone, String celular) {

		setId(id);
		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);

	}

	public Contato(String email, String telefone, String celular) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
