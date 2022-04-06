import java.util.Scanner;

public class Ejercicio1Ejemplo 
{
	public static void main(String[] args) 
	{
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String cadena = entrada.nextLine(); 
		System.out.println(cadena);*/
		 
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu Edad: ");
		int edad = entrada.nextInt();
		int edadActualizada = edad + 2;
		double real = 25.6;
		System.out.println("BUENOS DIAS TU EDAD ES " + edadActualizada);*/
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un numero entero: ");
		int numero = entrada.nextInt();
		
		
		if(numero % 2 == 0) 
		{
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}*/
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el tamaño de la lista: ");
		int n = entrada.nextInt();
		int menor = 150;
		int mayor = -1;
		//25,32,21,45,78
		for(int i = 0;i < n; i++) 
		{
			//consulta
			int j = i;
			System.out.println("Ingrese deportista : " + (j+1));
			//
			System.out.println("Ingrese numero : ");
			int numero = entrada.nextInt();
			
			if(numero < menor) {
				menor = numero;
			}
			
			if(numero > mayor) {
				mayor = numero;
			}
		}
		
		System.out.println("la menor edad es: "+ menor);
		System.out.println("la mayor edad es: "+ mayor);
		*/
		
		/*
		 * Dado un numero natural N. Determinar si este es primo.
		 * Dado un numero k natural mayor a 10 mostrar todos los numeros primos que le
			anteceden. Por ejemplo si k=12 la salida sera {2,3,5,7,11}
		 */
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el numero natural: ");
		int n = entrada.nextInt();
		
		int contadorDivisores = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) 
			{
				contadorDivisores = contadorDivisores + 1;
			}
		}
		if(contadorDivisores == 2) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		
		//ingresar k 2 ... k 12 j = 2 .. 11
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese el numero natural: ");
		int k = entrada.nextInt();
		for(int j=2;j<k;j++) 
		{
			contadorDivisores = 0;
			for(int i = 1; i <= j; i++) {
				if(j % i == 0) 
				{
					contadorDivisores = contadorDivisores + 1;
				}
			}
			if(contadorDivisores == 2) {
				System.out.println("Es primo"+j);
			}
		}
		
		
	}
}
