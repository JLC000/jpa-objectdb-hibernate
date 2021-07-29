package prueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona {

	@Id @GeneratedValue
	private int id;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Telefono> telefonos = new ArrayList<>();

	@Embedded
	private PruebaDate fechaNac;
	
	@Embedded
	private Address direccion;
	
	public Persona() {

	}

	public void direccion(String dir) {
		this.direccion = new Address(dir);
	}
	
	public void fechaNacimiento(LocalDate fecha) {
		this.fechaNac = new PruebaDate(fecha);
	}
	
	public void addTelefono(Telefono t) {
		this.telefonos.add(t);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private List<Telefono> getTelefonos() {
		return telefonos;
	}

	private void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private PruebaDate getFecha() {
		return fechaNac;
	}

	private void setFecha(PruebaDate fecha) {
		this.fechaNac = fecha;
	}

	private Address getDireccion() {
		return direccion;
	}

	private void setDireccion(Address direccion) {
		this.direccion = direccion;
	}
}
