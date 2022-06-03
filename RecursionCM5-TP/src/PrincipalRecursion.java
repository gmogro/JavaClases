import java.util.Scanner;

public class PrincipalRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno [] lista = new Alumno[2];
		Scanner sc = new Scanner(System.in);
		
		cargarAlumnos(lista,0,sc);
		
		System.out.println(lista[0].getNombre());
		System.out.println(lista[1].getNombre());
	}
	
	/*Dado un número entero expresado en base 10 devuelva su equivalente en
		base 2.
	 */
	public static int binario(int num) 
	{
		if(num == 0 || num == 1) 
		{
			return num;
		}
		else 
		{
			if(num!=0) {
				int d = num % 2;
				return binario(num/2)*10 + d;
			}
			else {
				return 0;
			}
		}
	}
	
	/*Dado dos números b (real) y e (entero) devolver b^e.*/
	
	public static int potencia(int real,int e) 
	{
		if(e == 0) 
		{
			return 1;
		}
		else 
		{
			return real * potencia(real,e-1);
		}
	}
	
	public static int factorial(int n) 
	{
		if(n == 0) 
		{
			return 1;
		}
		else 
		{
			return n * factorial(n-1);
		}
	}
	
	
	public static int fibonacci(int n) 
	{
		if(n == 0 || n == 1) 
		{
			return n;
		}
		else 
		{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	/*Dado un conjunto A de números enteros y un elemento “e” determina si “e“
	pertenece a A.*/
	
	public static int pertenece(int [] A,int i,int e) 
	{
		if(i<A.length) 
		{
			if(A[i] != e) 
			{
				return pertenece(A,i+1,e);
			}
			else {
				return i;
			}
		}
		return -1;
	}	
	
	public static int secuencial(int [] A,int e) 
	{
		int i = 0;
		while(i < A.length && e == A[i]) 
		{
			i = i +1;
		}
		
		if(i < A.length) {
			return i;
		}else {
			return -1;
		}
	}
	
	public static void cargarAlumnos(Alumno [] lista,int contadorElemento,Scanner sc)
	{
		if(contadorElemento < lista.length) 
		{
			System.out.println("Ingrese el nombre");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el apellido");
			String apellido = sc.nextLine();
			Alumno alu = new Alumno(nombre,apellido);
			lista[contadorElemento] = alu;
			cargarAlumnos(lista,contadorElemento+1,sc);
		}
	}
}







