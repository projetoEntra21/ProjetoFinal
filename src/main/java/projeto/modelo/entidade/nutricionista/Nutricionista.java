package projeto.modelo.entidade.nutricionista;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nutricionista")
	private int Id;

	@Column(name = "nome_nutricionista", nullable = false, unique = false)
	private String nome;

	@Column(name = "nome_nutricionista", nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "nome_nutricionista", nullable = false, unique = false)
	private String cnpj;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")

	private Nutricionista nutricionista;

	public Nutricionista() {
	}

	public Nutricionista(String nome, String sobrenome, String cpnj) {

		setNome(nome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public Nutricionista(int Id, String nome, String sobrenome, String cpnj) {
		setId(Id);
		setNome(sobrenome);
		setSobrenome(sobrenome);
		setCnpj(cpnj);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
