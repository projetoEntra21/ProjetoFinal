package projeto.modelo.entidade.historico.info.consulta;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import projeto.modelo.entidade.historico.entidade.nutricionista.Nutricionista;
import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consulta")
	Long Id;

	@Column(name = "horario_consulta", nullable = false, unique = false)
	LocalTime hora;

	@Column(name = "data_consulta", nullable = false, unique = false)
	LocalDate data;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nutricionista")
	private Nutricionista nutricionista;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Consulta() {
	}

	public Consulta(LocalTime hora, LocalDate data) {

		setData(data);
		setHora(hora);

	}

	public Consulta(Long id, LocalTime hora, LocalDate data) {

		setData(data);
		setHora(hora);
		setId(id);

	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime time) {
		this.hora = time;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Nutricionista getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(Nutricionista nutricionista) {
		this.nutricionista = nutricionista;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
