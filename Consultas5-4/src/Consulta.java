import java.util.Scanner;

public class Consulta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESA TU NOMBRE : ");
		String nombre = entrada.nextLine();
		System.out.println("INGRESA TU EDAD : ");
		int edad = entrada.nextInt();
		String saludo = "Mi nombre es : "+ nombre + " mi edad es : " + edad;
		System.out.println(saludo);*/
		
		// COMPONENTE DE ENTRADA , COMPONENTE DE SALIDA
		//COMPONENTE DE CONDICIONAL IF
		//COMPONENTE DE CONDICIONAL o BUCLES FOR - WHILE
		//ejercicio 13
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESA UN NUMERO NATURAL : ");
		int k = entrada.nextInt();
		
		for(int i=-k; i<=k ;i++) 
		{
			if(i % 2 == 0) 
			{
				System.out.println(i+",");
			}
		}*/
		
		//Dado un numero natural n mostrar sus digitos indivudualmente.
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.print("INGRESA UN NUMERO NATURAL : ");
		int n = entrada.nextInt();
		
		//Componente de digitos
		int aux = n;
		while(aux > 0)
		{
			int digito = aux % 10;
			System.out.println("digito: " + digito);
			aux = aux / 10;
		}*/
		//digitos
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.print("INGRESA UN NUMERO NATURAL : ");
		String n = entrada.nextLine();
		
		for(int i=0;i<n.length();i++) 
		{
			System.out.println(n.charAt(i));
		}*/
		
		System.out.println("suma "+ suma(5,7));
		
		
		
	}
	
	public static int suma(int a,int b) {
		return a + b;
	}

}
