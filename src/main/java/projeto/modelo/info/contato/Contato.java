package projeto.modelo.info.contato;

public class Contato {

	private int Id;
	private String email;
	private String telefone;
	private String celular;

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
