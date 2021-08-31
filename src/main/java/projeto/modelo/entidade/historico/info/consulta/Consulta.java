package projeto.modelo.entidade.historico.info.consulta;

import java.sql.Date;

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
@Table(name = "consulta")
public class Consulta {

	@Id
	@Column(name = "id_paciente")
	int Id;

	@Column(name = "horario_consulta", nullable = false, unique = false)
	Date hora;

	@Column(name = "data_consulta", nullable = false, unique = false)
	Date data;

	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	public Consulta() {
	}

	public Consulta(Date hora, Date data) {

		setData(data);
		setHora(hora);

	}

	public Consulta(int id, Date hora, Date data) {

		setData(data);
		setHora(hora);
		setId(id);

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
