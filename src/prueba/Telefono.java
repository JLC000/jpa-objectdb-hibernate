package prueba;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefono {

	@Id @GeneratedValue
	private int id;

	private String nro;

	public Telefono() {
	}

	public Telefono(String nro) {
		this.nro = nro;
	}
	
	private String getNro() {
		return nro;
	}

	private void setNro(String nro) {
		this.nro = nro;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}
}
