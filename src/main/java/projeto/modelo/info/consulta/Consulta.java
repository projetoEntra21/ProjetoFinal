package projeto.modelo.info.consulta;
import java.sql.Date;

public class Consulta {
	
	int Id;
	Date hora;
	Date data;
	
	public Consulta(int Id, Date hora, Date data) {
		
		setId(Id);
		setHora(hora);
		setData(data);
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
