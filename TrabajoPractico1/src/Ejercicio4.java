/*
 	Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones:
	Mostrar la suma
	Mostrar la multiplicacion
	Mostrar la resta
	Mostrar Division
*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 123; //sentencia asignacion
		int numero2 = 555;
		
		int resultadoSuma = numero + numero2;
		System.out.println("Resultado de la suma: " + numero + numero2);
		
		int resutaldoResta = numero2 - numero;
		System.out.println("Resultado de la Resta: " + resutaldoResta);
		
		int resutaldoProducto = numero * numero2;
		System.out.println("Resultado de la Multiplicacion: " + resutaldoProducto);
		
		double resutaldoDivision = (double)numero / (double)numero2; //(double) transforma el numero entero(int) a un numero real(double) 
		System.out.println("Resultado de la Division: " + resutaldoDivision);
		
		//int resutaldoResultado = numero % numero2;
	}
	
}
