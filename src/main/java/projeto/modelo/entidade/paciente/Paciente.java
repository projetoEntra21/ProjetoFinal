package projeto.modelo.entidade.paciente;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import projeto.controle.execptions.IdadeINvalidaExecption;
import projeto.modelo.entidade.nutricionista.Nutricionista;

@Entity
@Table(name = "paciente")
public class Paciente {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int Id;
	
	@Column(name = "id_endereço_paciente", nullable = true, unique = false)
	private int id_endereço_paciente;
	
	@Column(name = "id_contato_paciente", nullable = true, unique = false)
	private int id_contato_paciente;
	
	@Column(name = "id_cpf_paciente", nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "nome_paciente", nullable = false, unique = false)
	private String nome;
	
	@Column(name = "sobrenome_paciente", nullable = false, unique = false)
	private String sobrenome;
	
	@Column(name = "idade_paciente", nullable = false, unique = false)
	private int idade;
	
	@Column(name = "lista", nullable = false, unique = false)
	private List<Nutricionista> nutricionista = new ArrayList<Nutricionista>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	public Paciente() {}

	public Paciente(int Id, int endereço, int contato, String cpf, String nome, String sobrenome, int idade
			) throws IdadeINvalidaExecption {

		
		setId(Id);
		setCpf(cpf);
		setIdade(idade);
		setId_contato_paciente(contato);
		setId_endereço_paciente(endereço);
		setNome(nome);
		setSobrenome(sobrenome);

	}
	

	public Paciente(int endereço, int contato, String cpf, String nome, String sobrenome, int idade
			) throws IdadeINvalidaExecption {

		setCpf(cpf);
		setIdade(idade);
		setId_contato_paciente(contato);;
		setId_endereço_paciente(endereço);
		setNome(nome);
		setSobrenome(sobrenome);

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getId_endereço_paciente() {
		return id_endereço_paciente;
	}

	public void setId_endereço_paciente(int id_endereço_paciente) {
		this.id_endereço_paciente = id_endereço_paciente;
	}

	public int getId_contato_paciente() {
		return id_contato_paciente;
	}

	public void setId_contato_paciente(int id_contato_paciente) {
		this.id_contato_paciente = id_contato_paciente;
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

	public void setIdade(int idade) throws IdadeINvalidaExecption {

		if (idade < 0) {
			throw new IdadeINvalidaExecption("A sua idade está invalida");
		}

	}

	public void setNutricionista(List<Nutricionista> nutricionista) {
		this.nutricionista = nutricionista;
	}
}
