/*
 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el
menor.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero;
		int entero2 = 1000;
		int entero3 = 1000;
		
		entero = 0xE;
		System.out.println( entero);
		
		//&& si cumplen las preposiciones con valor de verdad verdadero es = a verdadero 
		if(entero > entero2 && entero > entero3)
		{
			System.out.println("Mayor : " + entero);
		}
		else {
			if(entero2 > entero && entero2 > entero3) 
			{
				System.out.println("Mayor : " + entero2);
			}
			else {
				System.out.println("Mayor : " + entero3);
			}
		}
		
		if(entero > entero2 && entero > entero3)
		{
			System.out.println("Mayor : " + entero);
		}
		else {
			if(entero2 > entero && entero2 > entero3) {
				System.out.println("Mayor : " + entero2);
			}
			else {
				System.out.println("Mayor : " + entero3);
			}
		}
		
	}

}
