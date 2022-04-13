import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ejercicio N.º 5
Dada una lista de números enteros, separarla en dos listas ordenadas de menor a mayor: la primera
con los números pares y la segunda con los números impares.*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista;
		lista = ingreso();
		ArrayList <Integer> pares =listaPares(lista);
		System.out.println("Pares");
		mostrar(pares);
		System.out.println("---------");
		ArrayList <Integer> impares =listaImpares(lista);
		System.out.println("Impares");
		mostrar(impares);
		System.out.println("---------");
		
	}
	public static void mostrar(ArrayList<Integer> lista) 
	{
		for(int i=0;i<lista.size();i++) 
		{
			System.out.println("Numero: "+lista.get(i));
		}
	}
	
	public static int [] ingreso() 
	{
		int [] lista = new int [12];
		Scanner entrada = new Scanner(System.in);
		//como la consigna no conocemos el tamaño de nuestro array
		//debemos hacer un entrada condicionada hasta que el usuario no desee ingresar mas
		int opcion = 1;
		int i = 0;
		while(opcion == 0) 
		{
			System.out.println("Ingrese un numero: ");
			lista[i] = entrada.nextInt();
			System.out.println("Desea ingresar otro numero ");
			System.out.println("Ingrese 0 - no  1 - si ");
			opcion = entrada.nextInt();
		}
		return lista;
	}
	//utilizaremos ArrayLista porque no conocemos el tamaño de nuestra lista de pares
	//y ArrayLista es redimensionable
	public static ArrayList<Integer> listaPares(int [] lista) 
	{
		ArrayList<Integer> listaPares = new ArrayList<Integer> ();
		for(int i=0;i<lista.length;i++) 
		{
			if(lista[i]%2 == 0) 
			{
				listaPares.add(lista[i]);
			}
		}
		return listaPares;
	}
	
	public static ArrayList listaImpares(int [] lista) 
	{
		ArrayList<Integer> listaImpares = new ArrayList<Integer> ();
		for(int i=0;i<lista.length;i++) 
		{
			if(lista[i]%2 != 0) 
			{
				listaImpares.add(lista[i]);
			}
		}
		return listaImpares;
	}
}
