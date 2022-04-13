import java.util.Scanner;

/*
 * Ejercicio N.� 3
Crear un vector de 10 n�meros reales, con valores solicitados al usuario. Por otro lado solicitar
una posici�n entre 0 y 9. Eliminar el elemento situado en esa posici�n sin dejar hueco. Visualizar
el vector resultante.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un posicion entre 0 y 9");
		int posicion = sc.nextInt();
		double [] lista = new double [10];
		ingreso(lista);
		eliminar(lista,9);
		mostrar(lista);
		
	}
	
	public static void ingreso(double [] lista) 
	{
		Scanner entrada = new Scanner(System.in);
		//como la consigna dice 10 elemento voy hacer un bucle repetitivo = 10
		for(int i=0;i < 10;i++) 
		{
			System.out.println("Ingrese un peso: ");
			lista[i] = entrada.nextDouble();
			
		}
	}
	
	public static void mostrar(double [] lista) 
	{
		//como la consigna dice 20 elemento voy hacer un bucle repetitivo = 20
		for(int i=0;i < 20;i++) 
		{
			System.out.println("Numero : "+lista[i]);
		}
	}
	
	//servira para eliminar un solo elemento
	public static void eliminar(double [] lista, int posicion) 
	{
		for(int i=posicion;i < 9;i++) 
		{ 
			//como estamos haciendo un corrimento de valores debemos ir hasta el tama�o menos uno sino 
			//deberiamos colocar en posicion 9 el valor de la posicion 10 donde no hay valor en esa posicion
			//ademas si eliminamos debemos actualizar nuestro tama�o de lista
			lista[i] = lista[i+1];
		}
		//no se puede actualizar el tama�o de la lista con [] array 
		//lo que deberiamos hacer un posibilidad es usar ArrayList el cual es redimensionable
		//sino lo que se vera esta semana OBJETOS donde tendriamos dos atributos el tama�o de la lista y la lista
	}
}
