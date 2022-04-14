/*
 * Ejercicio N° 3
Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).
Esta clase tendrá los métodos suma (), resta(), multiplicación() y división() que
recibirán como parámetros otro objeto de la misma clase NumerosEnteros.*/

public class NumeroEntero {
		
		//seccion de atributos
		private int a;
		//
		//seccion de metodos
		//contructores
		public NumeroEntero() {
			
		}
		public NumeroEntero(int a) 
		{
			this.a = a;
		}
		//
		//Geters y seters
		public int getA() {
			return this.a;
		}
		public void setA(int a) {
			this.a = a;
		}
		//
		//Seccion de metodos propios de la clase
		public int suma(NumeroEntero numero) 
		{
			return this.getA() + numero.getA();
		}
		
		public int resta(NumeroEntero numero) 
		{
			return this.getA() - numero.getA();
		}
		public int producto(NumeroEntero numero) 
		{
			return this.getA() * numero.getA();
		}
		public double division(NumeroEntero numero) 
		{
			//validar que a no sea = 0
			//convertir el valor a double
			double resutaldo = (double)this.getA() / (double)numero.getA();
			return resutaldo;
		}
		
		
		
		
		
}
