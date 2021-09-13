package projeto.modelo.entidade.historico;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "historico")
public class Historico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_paciente")
	private Long Id;

	@Column(name = "peso_historico", nullable = false, unique = false)
	private double peso;

	@Column(name = "altura_historico", nullable = false, unique = false)
	private double altura;

	@Column(name = "quadril_historico", nullable = false, unique = false)
	private double quadril;

	@Column(name = "cintura_historico", nullable = false, unique = false)
	private double cintura;

	@Column(name = "imc_historico", nullable = false, unique = false)
	private double imc;

	@Column(name = "densidade_historico", nullable = false, unique = false)
	private double densidade;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Historico (Long id) {
		
		setId(id);
	}
	
	public Historico(double peso, double altura, double quadril, double cintura, double imc, double densidade) {

		setAltura(altura);
		setCintura(cintura);
		setDensidade(densidade);
		setImc(imc);
		setPeso(peso);
		setQuadril(quadril);

	}

	public Historico(Long id, double peso, double altura, double quadril, double cintura, double imc,
			double densidade) {

		setId(id);
		setAltura(altura);
		setCintura(cintura);
		setDensidade(densidade);
		setImc(imc);
		setPeso(peso);
		setQuadril(quadril);

	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;

	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;

	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}

	public double getCintura() {
		return cintura;
	}

	public void setCintura(double cintura) {
		this.cintura = cintura;

	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {

		this.imc = imc;
	}

	public double getDensidade() {
		return densidade;
	}

	public void setDensidade(double densidade) {

		this.densidade = densidade;

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
