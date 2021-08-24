package projeto.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import projeto.controle.execptions.AlturaInvalidaExecption;
import projeto.controle.execptions.CinturaInvalidadExecption;
import projeto.controle.execptions.DensidadeInvalidaExecption;
import projeto.controle.execptions.ImcInvalidoExecption;
import projeto.controle.execptions.PesoInvalidoExecption;
import projeto.controle.execptions.QuadrilInvalidoException;
import projeto.modelo.entidade.paciente.Paciente;

@Entity
@Table(name = "historico")

public class Historico implements Serializable {

	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@Column(name = "id_paciente")
	private int Id;

	@Column(name = "peso_historico", nullable = false, unique = false)

	private float peso;

	@Column(name = "altura_historico", nullable = false, unique = false)
	private float altura;

	@Column(name = "quadril_historico", nullable = false, unique = false)
	private float quadril;

	@Column(name = "cintura_historico", nullable = false, unique = false)
	private float cintura;

	@Column(name = "imc_historico", nullable = false, unique = false)

	private float imc;

	@Column(name = "densidade_historico", nullable = false, unique = false)
	private float densidade;

	@Column(name = "data_historico", nullable = false, unique = false)

	private Date horario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente")
	Paciente paciente;

	public Historico(float peso, float altura, float quadril, float cintura, float imc, float densidade, Date horario)
			throws AlturaInvalidaExecption, PesoInvalidoExecption, QuadrilInvalidoException, CinturaInvalidadExecption,
			ImcInvalidoExecption, DensidadeInvalidaExecption {

		setHorario(horario);
		setAltura(altura);
		setCintura(cintura);
		setDensidade(densidade);
		setImc(imc);
		setPeso(peso);
		setQuadril(quadril);
	}

	public Historico(int Id, float peso, float altura, float quadril, float cintura, float imc, float densidade,
			Date horario) throws AlturaInvalidaExecption, PesoInvalidoExecption, QuadrilInvalidoException,
			CinturaInvalidadExecption, ImcInvalidoExecption, DensidadeInvalidaExecption {

		setId(Id);
		setAltura(altura);
		setCintura(cintura);
		setDensidade(densidade);
		setImc(imc);
		setPeso(peso);
		setQuadril(quadril);
		setHorario(horario);
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) throws PesoInvalidoExecption {
		if (peso <= 0)
			throw new PesoInvalidoExecption("O seu peso está incorreto!");
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws AlturaInvalidaExecption {
		if (altura <= 3 && altura < 0)
			throw new AlturaInvalidaExecption("Converta sua altura para centímetros!");
		this.altura = altura;
	}

	public float getQuadril() {
		return quadril;
	}

	public void setQuadril(Float quadril) throws QuadrilInvalidoException {
		if (quadril <= 0)
			throw new QuadrilInvalidoException("O seu quadril está inválido!");
		this.quadril = quadril;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(Float cintura) throws CinturaInvalidadExecption {
		if (cintura <= 0)
			throw new CinturaInvalidadExecption("A sua cintura está inválida!");
		this.cintura = cintura;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) throws ImcInvalidoExecption {
		if (imc <= 0)
			throw new ImcInvalidoExecption("O seu IMC está inválido!");
		this.imc = imc;
	}

	public float getDensidade() {
		return densidade;
	}

	public void setDensidade(float densidade) throws DensidadeInvalidaExecption {
		if (densidade <= 0)
			throw new DensidadeInvalidaExecption("O seu IMC está inválido!");
		this.densidade = densidade;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date dataAtualizada) {
		this.horario = dataAtualizada;
	}
}
