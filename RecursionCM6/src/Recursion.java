
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = {1,2,3,125,12};
		System.out.println(pertenece(lista,0,1));
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
		else {
			if(num != 0 ) 
			{
				return num%2 + binario(num/2) *10;
			}
			else {
				return 0;
			}
		}
	}
	
	/* Dado dos números b (real) y e (entero) devolver b^e.*/
	
	public static int potencia(int b,int e) 
	{
		if(e == 0) 
		{
			return 1;
		}
		else 
		{
			return b * potencia(b,e-1);
		}
	}
	
	/*Implementar la función factorial.*/
	
	public static int factorial(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		else 
		{
			return n * factorial(n-1);
		}
	}
	
	/* Implementar la serie de Fibonacci*/
	
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
	
	public static int pertenece(int [] lista, int i ,int e) 
	{
		if(i<lista.length) 
		{
			if(lista[i] != e) 
			{
				return pertenece(lista,i+1,e);
			}
			else {
				return i;
			}
		}
		return -1;
	}
	
	
}














