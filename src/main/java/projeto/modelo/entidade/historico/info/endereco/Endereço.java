package projeto.modelo.entidade.historico.info.endereco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "endereco")
public class Endereço implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "rua_endereco", nullable = false, unique = false)
	private String rua;

	@Column(name = "cep_endereco", nullable = false, unique = false)
	private String cep;

	@Column(name = "numero_endereco", nullable = false, unique = true)
	private int numero;

	@Column(name = "complemento_endereco", length = 30, nullable = false, unique = false)
	private String complemento;

	@ManyToMany(mappedBy = "enderecos")
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

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

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
}
