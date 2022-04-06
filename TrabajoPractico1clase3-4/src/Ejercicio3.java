/*
 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el
menor.

Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones:
Mostrar la suma
Mostrar la multiplicacion
Mostrar la resta
Mostrar Division
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variables
		int entero = 123;
		int entero2 = 3;
		int entero3 = 1;
		
		if(entero>entero2 && entero>entero3) 
		{
			System.out.println("Entero es mayor");
		}
		else {
			if(entero2>entero && entero2>entero3) {//entero2
				
			}
			else {
				
			}
		}//else
//---------------------------------------------------
		//ejercicio 4
		int sumando = 123;
		int sumando2 = 3;
		//asignacion
		int resultadoSuma = sumando + sumando2;
		System.out.println("La suma es: "+ resultadoSuma);
		//
		sumando += sumando2;
		
		int resultadoResta = sumando - sumando2;
		System.out.println("La resta es: "+ resultadoResta);
		
		System.out.println("La produto es: "+ (sumando + sumando2));
		System.out.println("La division es: "+ (sumando + sumando2));
		
	}//mainresultadoSuma
}//cierra la clase
