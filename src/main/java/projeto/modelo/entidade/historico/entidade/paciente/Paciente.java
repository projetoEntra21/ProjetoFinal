package projeto.modelo.entidade.historico.entidade.paciente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "cpf_paciente", nullable = false, unique = true)
	private String cpf;

	@Column(name = "nome_paciente", length = 25, nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome_paciente", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "idade_paciente", nullable = false, unique = false)
	private int idade;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL, CascadeType.MERGE })
	@JoinTable(name = "nutricionista_paciente", joinColumns = @JoinColumn(name = "id_paciente"), inverseJoinColumns = @JoinColumn(name = "id_nutricionista"))
	private List<Nutricionista> nutricionistas = new ArrayList<Nutricionista>();

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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public List<Nutricionista> getNutricionistas() {
		return nutricionistas;
	}

	public void adicionarNutricionista(Nutricionista nutricionista) {
		this.nutricionistas.add(nutricionista);
	}
}
