import java.util.Scanner;

/*Ejercicio N.º 1
Crear un array de 10 de números enteros, con valores solicitados por teclado. Mostrar por
consola el índice y el valor de cada elemento. Realizar dos métodos, uno para el ingreso de
datos y otro para la salida de datos.*/
public class Ejercicio1 {
	//Utilizare Array [] no ArrayList
	public static void main(String args[]) 
	{
		//Creo una Instancia de un Array
		int [] lista = new int[10]; //es de tamaño 10 por la consigna
		
		ingreso(lista);//lleno de datos mi lista
		mostrar(lista);//muestro todos los elementos de la lista
		//recuerden void nuestro metodo no devuelve valores
		//si devuelve un valor deberian crear una variable en nuestro main para que la reciba
	}
	
	
	//seccion metodos
	public static void ingreso(int [] lista) 
	{
		Scanner entrada = new Scanner(System.in);
		//como la consigna dice 10 elemento voy hacer un bucle repetitivo = 10
		for(int i=0;i < 10;i++) 
		{
			System.out.println("Ingrese numero: ");
			lista[i] = entrada.nextInt();
		}
	}
	
	public static void mostrar(int [] lista) 
	{
		//como la consigna dice 10 elemento voy hacer un bucle repetitivo = 10
		for(int i=0;i < 10;i++) 
		{
			System.out.println("Numero : "+lista[i]);
		}
	}
}
