import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa una palabraaba");
		String palabra = sc.nextLine();
		palindromo(palabra);
	}
	public static void palindromo(String palabra) 
	{
		String palabraInvertida="";
		for(int i=palabra.length()-1;i>=0;i--) 
		{
			palabraInvertida = palabraInvertida + palabra.charAt(i);
		}
		if(palabraInvertida.equals(palabra)) 
		{
			System.out.println("Palindromo");
		}
		else 
		{
			System.out.println("NO ES Palindromo");
		}
	}
}
