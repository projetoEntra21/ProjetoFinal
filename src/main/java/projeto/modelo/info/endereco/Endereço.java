package projeto.modelo.info.endereco;

public class Endereço {

	private int Id;
	private String rua;
	private String cep;
	private int numero;
	private String complemento;

	public Endereço(String rua, String cep, int numero, String complemento) {

		setRua(rua);
		setCep(cep);
		setComplemento(complemento);
		setNumero(numero);
	}

	public Endereço(int Id) {
		
		setId(Id);
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
