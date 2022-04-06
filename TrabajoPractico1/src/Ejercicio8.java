/*
 * Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
por el usuario.*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese cantidad de segundos");
		double segundos = teclado.nextDouble();
		teclado.close();*/
		
		double segundos = 4000;
		double minutos = segundos/60;
		
		System.out.println("Minutos: " + minutos);
	}

}
