package projeto.modelo.entidade.historico.info.consulta;

import java.sql.Date;
import java.sql.Time;
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
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import projeto.modelo.entidade.historico.entidade.paciente.Paciente;

@Entity
@Table(name = "consulta")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	int Id;

	@Column(name = "horario_consulta", nullable = false, unique = false)
	Time hora;

	@Column(name = "data_consulta", nullable = false, unique = false)
	Date data;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL, CascadeType.MERGE })
	@JoinTable(name = "consulta_pacientes", joinColumns = @JoinColumn(name = "id_paciente"), inverseJoinColumns = @JoinColumn(name = "id_nutricionista"), inverseJoinColumns = @JoinColumn(name = "id_consultas"))
	private List<Consulta> consultas = new ArrayList<Consulta>();


	public Consulta() {
	}

	public Consulta(Time hora, Date data) {

		setData(data);
		setHora(hora);

	}

	public Consulta(int id, Time hora, Date data) {

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

	public Time getHora() {
		return hora;
	}

	public void setHora(Time time) {
		this.hora = time;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

//	public Paciente getPaciente() {
//		return paciente;
//	}
//
//	public void setPaciente(Paciente paciente) {
//		this.paciente = paciente;
//	}

}
