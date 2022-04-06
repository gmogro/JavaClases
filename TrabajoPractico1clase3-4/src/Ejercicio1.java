
/*
 * Declarar una variable de tipo cadena (String) y una variable de tipo entero, asignar a la
variable string tu nombre y a la variable entera tu edad y mostrar el mensaje "Mi nombre
es...y mi edad es..."
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para poder ingresar datos por teclado tipo cadenas
		Scanner scannerEntero = new Scanner(System.in);// Instancia un Objeto Scanner 
	    System.out.println("Ingresa Tu nombre");// Muesta un cartel
	    int numeroEntero = scannerEntero.nextInt();//toma valor ingresado
	    scannerEntero.close();//cierra el scaner
	    
	    //ingresa entero
	    Scanner scannerCadena = new Scanner(System.in);// Instancia un Objeto Scanner 
	    System.out.println("Ingresa Tu nombre");// Muesta un cartel
	    String nombre = scannerCadena.nextLine();//toma valor ingresado
	    scannerCadena.close();//cierra el scaner
	    
	    //ingresa double
	    Scanner scannerReal = new Scanner(System.in);// Instancia un Objeto Scanner 
	    System.out.println("Ingresa Tu nombre");// Muesta un cartel
	    double numeroReal = scannerReal.nextDouble();//toma valor ingresado
	    scannerReal.close();//cierra el scaner
	    
	    
		//para poder declarar una variable tipo cadena voy a utilizar la clase String
		String cadenaEjemplo; //sentecia declarativa
		String cadenaEjemplo2 = "Hola me llamo Guillermo"; //sentecia de asignacion
		//declaro un variable cadena con mi nombre
		String cadena = "Mogro Guillermo Cristian";
		//int es el tipo de dato entero 
		int edad = 30;
		//cadena para mostrar
		String cadenaSalida = cadena + ' ' + edad + ' ' +"años";
		//Vamos el System.out.println("");
		System.out.println(nombre + ' ' + edad + ' ' +"años");
		// el + en Strings se utiliza para unir(concatenar) cadenas 
		//edad se transforma en un tipo cadena
		
		//ejercicio2
		int doce = 12;
		int veinte = 20;
		System.out.println("el numero entero es : "+ doce);
		
		
	}

}
