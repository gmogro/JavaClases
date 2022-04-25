
public class Empleado {
	
	private Persona empleado;
	private double sueldo;
	
	public Empleado(Persona empleado, double sueldo) {
		super();
		this.empleado = empleado;
		this.sueldo = sueldo;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
