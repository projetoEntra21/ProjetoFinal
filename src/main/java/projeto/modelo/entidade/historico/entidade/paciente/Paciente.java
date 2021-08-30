package projeto.modelo.entidade.historico.entidade.paciente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import projeto.controle.execptions.IdadeINvalidaExecption;

@Entity
@Table(name = "paciente")
public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "id_endereco_paciente", nullable = false, unique = true)
	private int id_endereço_paciente;
	
	@Column(name = "id_consulta_paciente", nullable = false, unique = true)
	private int id_consulta_paciente;

	@Column(name = "id_contato_paciente", nullable = false, unique = true)
	private int id_contato_paciente;

	@Column(name = "cpf_paciente", nullable = false, unique = true)
	private String cpf;

	@Column(name = "id_historico_paciente", nullable = false, unique = true)
	private int id_historico_paciente;

	@Column(name = "nome_paciente", length = 25, nullable = false, unique = false)
	private String nome;

	@Column(name = "sobrenome", length = 25, nullable = false, unique = false)
	private String sobrenome;

	@Column(name = "idade_paciente", nullable = false, unique = false)
	private int idade;

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

	public void setIdade(int idade) {
		this.idade = idade;

	}

//	public void setNutricionista(List<Nutricionista> nutricionista) {
//		this.nutricionista = nutricionista;
//	}
}
