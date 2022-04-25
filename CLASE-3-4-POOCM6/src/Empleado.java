
public class Empleado {
	
		private Persona empleado;
		private double sueldoBasico;
		private String cuit;
		
		public Empleado(Persona empleado, double sueldoBasico) {
			this.empleado = empleado;
			this.sueldoBasico = sueldoBasico;
		}
		//get y set codificar
		
		public double calcularSueldo(int horas) 
		{
			return this.sueldoBasico *  horas;
		}

		public Persona getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Persona empleado) {
			this.empleado = empleado;
		}

		public double getSueldoBasico() {
			return sueldoBasico;
		}

		public void setSueldoBasico(double sueldoBasico) {
			this.sueldoBasico = sueldoBasico;
		}

		public String getCuit() {
			return cuit;
		}

		public void setCuit(String cuit) {
			this.cuit = cuit;
		}
		
		
}
