package prueba;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class PruebaDate {
	
	private Date fecha;
	
	public PruebaDate(LocalDate fecha) {
		this.fecha = Date.valueOf(fecha);
	}
	
	public String fecha() {
		return this.fecha.toLocalDate().toString();
	}
	
	protected PruebaDate() {}
	
	//para JPA
	private Date getFecha() {
		return fecha;
	}
	
	//para JPA
	private void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
