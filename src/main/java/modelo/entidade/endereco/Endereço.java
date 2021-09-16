package modelo.entidade.endereco;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import modelo.entidade.paciente.Paciente;

@Entity
@Table(name = "endereco")
public class Endereço implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_paciente")
	private Long Id;

	@Column(name = "rua_endereco", nullable = false, unique = false)
	private String rua;

	@Column(name = "cep_endereco", nullable = false, unique = false)
	private String cep;

	@Column(name = "numero_endereco", nullable = false, unique = true)
	private Long numero;

	@Column(name = "complemento_endereco", length = 30, nullable = false, unique = false)
	private String complemento;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Endereço() {}
	
	public Endereço(Long id){
		
		setId(Id);
		
	}
	
	public Endereço(String rua, String cep, Long numero, String complemento) {

		setRua(rua);
		setCep(cep);
		setComplemento(complemento);
		setNumero(numero);
	}

	public Endereço(Long id,String rua, String cep, Long numero, String complemento) {

		setId(id);
		setRua(rua);
		setCep(cep);
		setComplemento(complemento);
		setNumero(numero);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
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

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


}
