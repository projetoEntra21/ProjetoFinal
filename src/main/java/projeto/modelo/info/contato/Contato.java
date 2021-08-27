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

	@Id
	@Column(name = "id_contatos")
	private int Id;

	@Column(name = "email_contatos")
	private String email;

	@Column(name = "telefone_contatos")
	private String telefone;

	@Column(name = "celular_contatos")
	private String celular;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_contatos_paciente")
	private Paciente paciente;

	public Contato() {}

	public Contato(int id, String email, String telefone, String celular) {

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

}
