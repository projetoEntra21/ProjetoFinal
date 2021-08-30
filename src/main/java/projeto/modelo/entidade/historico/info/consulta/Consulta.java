package projeto.modelo.entidade.historico.info.consulta;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

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

}
