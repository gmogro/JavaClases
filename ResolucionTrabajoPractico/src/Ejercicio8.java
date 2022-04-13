import java.util.Scanner;

/*Ejercicio N° 8
Ingrese 10 nombres de personas en un vector, luego ingrese un nombre cualquiera y búsquelo en el
vector, si el nombre aparece en el vector mostrar "Nombre encontrado" en caso contrario "Nombre
no encontrado".*/
public class Ejercicio8 {
	public static void main(String[] args) {
		String [] lista = new String[10];
		ingreso(lista);
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa una palabra a buscar:");
		String palabra = sc.nextLine();
		if(busquedaSecuencial(lista,palabra)!=-1) 
		{
			System.out.println("El nombre esta en la posicion: "+busquedaSecuencial(lista,palabra));
		}
		else 
		{
			System.out.println("No esta el nombre en la lista");
		}
	}
	
	public static void ingreso(String [] lista) 
	{
		Scanner entrada = new Scanner(System.in);
		//como la consigna dice 10 elemento voy hacer un bucle repetitivo = 10
		for(int i=0;i < 10;i++) 
		{
			System.out.println("Ingrese Nombre: ");
			lista[i] = entrada.nextLine();
		}
	}
	
	public static  int busquedaSecuencial(String []arreglo,String dato)
	{
	  boolean encontrado = false;
	  int posicion = 0;
	  while(posicion<arreglo.length && !encontrado){
		  if(dato.equals(arreglo[posicion])) 
		  {
			  encontrado = true;
		  }
		  posicion = posicion + 1;
	  }
	  if(encontrado) 
	  {
		  return posicion;
	  }
	  else 
	  {
		return -1;  
	  }
	 
	}

}
