package projeto.modelo.entidade.paciente;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.nutricionista.Nutricionista;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "id_endereco_paciente", nullable = true, unique = false)
	private int id_endereco_paciente;

	@Column(name = "id_contato", nullable = true, unique = false)
	private int id_contato;

	@Column(name = "id_cpf_paciente", length = 14, nullable = false, unique = true)
	private String cpf;

	@Column(name = "nome_paciente", nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome_paciente", nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "idade_paciente", nullable = false, unique = false)
	private int idade;

//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinTable(name = "nutricionista" )
//	private List<Nutricionista> nutricionista = new ArrayList<Nutricionista>();

	public Paciente() {
	}

	public Paciente(String cpf, String nome, String sobrenome, int idade) throws IdadeINvalidaExecption {

		setCpf(cpf);
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);

	}

	public Paciente(int Id, String cpf, String nome, String sobrenome, int idade) throws IdadeINvalidaExecption {

		setCpf(cpf);
		setId(Id);
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);

	}
	
	public Paciente(int Id) {

		
		setId(Id);
	
		

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getId_endereco_paciente() {
		return id_endereco_paciente;
	}

	public void setId_endereco_paciente(int id_endereco_paciente) {
		this.id_endereco_paciente = id_endereco_paciente;
	}

	public int getId_contato_paciente() {
		return id_contato;
	}

	public void setId_contato_paciente(int id_contato) {
		this.id_contato = id_contato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}

//	public void setNutricionista(List<Nutricionista> nutricionista) {
//		this.nutricionista = nutricionista;
//	}
}
