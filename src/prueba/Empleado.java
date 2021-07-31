package prueba;

import javax.persistence.Entity;

@Entity
public class Empleado extends Persona {

	private float salario;
	
	public Empleado(String nombre, float salario) {
		super(nombre);
		this.salario = salario;
	}
	
	protected Empleado() {}

	private float getSalario() {
		return salario;
	}

	private void setSalario(float salario) {
		this.salario = salario;
	}
}
