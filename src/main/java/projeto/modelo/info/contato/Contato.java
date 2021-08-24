package projeto.modelo.info.contato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import projeto.modelo.entidade.paciente.Paciente;

@Entity
@Table(name = "contatos")
public class Contato {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "email_contatos", nullable = false, unique = true)
	private String email;

	@Column(name = "telefone_contatos", nullable = true, unique = true)
	private String telefone;

	@Column(name = "celular_contatos", nullable = false, unique = true)
	private String celular;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente")
	
	private Paciente paciente;
	
	public Contato() {}

	public Contato(String email, String telefone, String celular) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);

	}

	public Contato(int Id, String email, String telefone, String celular) {

		setCelular(celular);
		setEmail(email);
		setTelefone(telefone);
		setId(Id);
	}

	public Contato(int Id) {

		setId(Id);

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
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
