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
		//int numero = 100;//sentecia de asignacion
		
		int numero2 = 156;//sentecia de asignacion
		int numero3 = 564;
		
		//suma
		int resultado = (numero2+numero3);
		//resta
		int resultadoResta = numero2 - numero3;
		
		int resultadoDivision = numero2 / numero3;
		
		int resultadoProducto = numero2 * numero3;
		
	    System.out.println("el resultado : " + resultado);
	    System.out.println("el resultado : " + resultadoResta);
	    System.out.println("el resultado : " + resultadoDivision);
	    System.out.println("el resultado : " + resultadoProducto);
	}

}
