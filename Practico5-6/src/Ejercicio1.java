import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Crear un array de 10 de números enteros, con valores solicitados por teclado. Mostrar por
		consola el índice y el valor de cada elemento. Realizar dos métodos, uno para el ingreso de
		datos y otro para la salida de datos.
		*/
		//definir un array
		//opcion 1
		//int [] arrayEnteros;
		//arrayEnteros = new int[10];
		//opcion 2
		//arrayEnteros2 [0] = 5; 
		//System.out.println(arrayEnteros2[0]);
		//inicializar
		//int [] arrayEnteros = {2,3,4,5,6,7,12,354,54,1};
		//int arrayEnteros2 [] = new int [10];
		//llenamos el array
		/*for(int i = 0; i < 10 ;i++) 
		{
			arrayEnteros2 [i] = i;
		}*/
		//mostramos
		/*System.out.print("[");
		for(int i = 0; i < 10;i++) 
		{
			System.out.print(arrayEnteros2[i]+",");
		}
		System.out.print("]");*/
		//clases contenedoras Integer, Double 
		//String no causa error
		//ArrayList <Integer> arrayListEnteros = new ArrayList<Integer> (); 
		//arrayListEnteros.add(0,5);
		//arrayListEnteros.add(6);
		/*for(int i = 0; i < 10 ;i++) 
		{
			arrayListEnteros.add(i,i);
		}
		System.out.print("[");
		for(int i = 0; i < 10;i++) 
		{
			System.out.print(arrayListEnteros.get(i)+",");
		}
		System.out.print("]");*/
		
		int lista [] = entrada();
		salida(lista);
		
		int lista2[] = new int[10];
		entrada2(lista2);
		salida(lista2);
		
		
	}
	
	public static int [] entrada() 
	{
		Scanner sc = new Scanner(System.in);
		int arrayEnteros2 [] = new int [10];
		for(int i = 0; i < 10 ;i++) 
		{
			System.out.println("Ingrese numeros : ");
			int numero = sc.nextInt();
			arrayEnteros2 [i] = numero;
		}
		return arrayEnteros2;
	}
	
	public static void entrada2(int [] lista) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10 ;i++) 
		{
			System.out.println("Ingrese numeros : ");
			int numero = sc.nextInt();
			lista [i] = numero;
		}
	}
	
	public static void salida (int [] arrayEnteros ) {
		
		System.out.print("[");
		for(int i = 0; i < 10;i++) 
		{
			System.out.print(arrayEnteros[i]+",");
		}
		System.out.print("]");
	}
}
