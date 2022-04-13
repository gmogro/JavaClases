import java.util.Scanner;

/*Ejercicio N° 7
Escriba un programa que determine la cantidad de vocales y consonantes de una palabra.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa una palabra");
		String palabra = sc.nextLine();
		int contadorVocales = vocales(palabra);
		int contadorConsonantes = consonantes(palabra);
		System.out.println(contadorVocales);
		System.out.println(contadorConsonantes);
	}
	
	public static int vocales(String palabra) 
	{
		int contador=0;
		char [] vocales = {'A','E','I','O','U','a','e','i','o','u'}; 
		for(int i=0;i<palabra.length();i++) 
		{
			for(int j=0;j<vocales.length;j++) 
			{
				if(palabra.charAt(i) == vocales[j]) 
				{
					contador = contador +1;
				}
			}
		}
		return contador;
	}
	
	public static int consonantes(String palabra) 
	{
		int contador=0;
		char [] consonantes = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
							    'p','q','r','s','t','u','v','w','x','y','z',
							    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
							    'P','Q','R','S','T','U','V','W','X','Y','Z'}; 
		for(int i=0;i<palabra.length();i++) 
		{
			for(int j=0;j<consonantes.length;j++) 
			{
				if(palabra.charAt(i) == consonantes[j] || palabra.charAt(i) == consonantes[j]) 
				{
					contador = contador +1;
				}
			}
		}
		return contador;
	}

}
