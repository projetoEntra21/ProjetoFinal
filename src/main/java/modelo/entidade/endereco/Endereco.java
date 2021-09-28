package modelo.entidade.endereco;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import modelo.entidade.paciente.Paciente;
import modelo.entidade.usuario.Usuario;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_endereco")
	private Long Id;

	@Column(name = "cep_endereco", nullable = false, unique = false)
	private String cep;

	@Column(name = "rua_endereco", length = 25, nullable = true, unique = false)
	private String rua;
	
	@Column(name = "bairro_endereco", length = 25, nullable = false, unique = false)
	private String bairro;
	
	@Column(name = "cidade_endereco", length = 15, nullable = false, unique = false)
	private String cidade;
	
	@Column(name = "estado_endereco", length = 15, nullable = false, unique = false)
	private String estado;
	
	@Column(name = "numero_endereco", nullable = false, unique = true)
	private Long numero;

	@Column(name = "complemento_endereco", length = 30, nullable = false, unique = false)
	private String complemento;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Endereco() {}

	public Endereco(Long id) {

		setId(Id);

	}

	public Endereco(String rua, String bairro, String cidade, String estado, String cep, Long numero, String complemento) {

		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setComplemento(complemento);
		setNumero(numero);
	}

	public Endereco(Long id, String cep, Long numero, String complemento) {

		setId(id);
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
