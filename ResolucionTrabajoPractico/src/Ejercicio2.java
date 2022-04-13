import java.util.Scanner;

/*
 Ejercicio N.º 2
Crear un vector de 20 números reales correspondientes a los pesos de 20 personas. Obtener el
peso mayor, el menor, el peso medio y visualizar un mensaje si hay alguna persona con un peso
mayor de 100 kg.*/
public class Ejercicio2 {
	public static void main(String[] args) 
	{
		//la consigna no me indica si lo pesos son ingresados por el usario
		//podemos utilizar o no el metodo de entrada de ejercicio 1 modificandolo que reciba reales
		double [] lista = new double [20];
		ingreso(lista);
		double mayor = mayor(lista);
		double menor = menor(lista);
		double promedio = promedio(lista);
		System.out.println("El numero mayor es : "+mayor);
		System.out.println("El numero menor es : "+menor);
		System.out.println("El promedio de peso es : "+promedio);
		
	}
	public static void ingreso(double [] lista) 
	{
		Scanner entrada = new Scanner(System.in);
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		for(int i=0;i < 20;i++) 
		{
			System.out.println("Ingrese un peso: ");
			lista[i] = entrada.nextDouble();
			if(lista[i]>100) 
			{
				System.out.println("Peso mayor a 100 "+ lista[i]);
			}
		}
	}
	
	public static void mostrar(int [] lista) 
	{
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		for(int i=0;i < 20;i++) 
		{
			System.out.println("Numero : "+lista[i]);
		}
	}
	
	//devuelve menor
	public static double menor(double [] lista) 
	{
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		double menor = lista[0]; //asigno como menor al primer numero de la lista
		for(int i=1;i < 20;i++) //empiezo en 1 que es el siguiente del primero de la lista
		{
			if(lista[i]<menor) 
			{
				menor = lista[i];
			}
		}
		return menor;
	}
	
	//devuelve mayor
	public static double mayor(double [] lista) 
	{
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		double mayor = lista[0]; //asigno como mayor al primer numero de la lista
		for(int i=1;i < 20;i++) //empiezo en 1 que es el siguiente del primero de la lista
		{
			if(lista[i]>mayor) 
			{
				mayor = lista[i];
			}
		}
		return mayor;
	}
	
	public static double promedio(double [] lista) 
	{
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		double promedio = lista[0]; //asigno promedio con el primer numero de la lista puede empezar en 0 es un acumulador
		for(int i=1;i < 20;i++) //empiezo en 1 que es el siguiente del primero de la lista
		{
			promedio += lista[i];
		}
		return promedio/20;
	}
	
}
