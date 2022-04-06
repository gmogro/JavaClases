
/*
 Dada un lista con las edades de N deportistas, se necesita informar la edad promedio de
los deportistas de la lista; cual es la menor y la mayor edad ingresada.
 */
import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for while 
		
		int n = 5;
		int acumulador = 0;
		int menor = 150;
		int mayor = -1;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < n; i++) 
		{
			
			System.out.println("Ingresa edad");
			int edad = teclado.nextInt();
			//teclado.close();
			acumulador = acumulador + edad;
			if(menor > edad) {
				menor = edad;
			}
			if(mayor<edad) {
				mayor = edad;
			}
			//System.out.print("edad : "+edad+ " ");
		}
		
		double promedio = acumulador / n;
		System.out.println("menor : "+menor);
		System.out.println("mayor : "+mayor);
		System.out.println("promedio : "+promedio);
	}
}
