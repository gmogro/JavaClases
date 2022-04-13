import java.util.Random;

/*
 * Ejercicio N.º 4
Generar 20 números enteros entre 1 y 100 de forma aleatoria y contar cuántos de esos números
enteros son divisibles entre 5.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lista = numeroAleatorios();
		int contador = 0;
		for(int i=0; i<lista.length;i++) 
		{
			if(divisible(lista[i],5)) 
			{
				contador = contador +1;
			}
		}
		System.out.println("El total de numero divisible por 5 es : "+contador);
	}
	
	public static int [] numeroAleatorios() {
		int [] lista = new int[20];
		//aparece un clase nueva teniamos Scanner ArrayList ahora Random 
		//tambien del paquete java.util importado al inicio de todo
		Random claseRandom = new Random(); //creamos o instaciamos un Objecto Random
		
		for(int i=0;i<20;i++) 
		{
			lista[i] = 1 + claseRandom.nextInt(100 - 1); //genera numero aleatorio entre 1 y 100 no incluido el 100
			//la clase random 
			// claseRandom.nextInt() devolvera numero aleatorios entre 0 y 1 sin incluir el 1
			// claseRandom.nextInt()*limite  devolvera numero aleatorios entre 0 y limite sin incluir el limite
			// inicio + claseRandom.nextInt(limite -inicio) devolvera numero aleatorios entre inicio y limite sin incluir al limite
			
		}
		
		return lista;
	}
	
	public static boolean divisible(int dividiendo ,int divisor) 
	{
		//USEMOS IF 
		return dividiendo % divisor == 0;//devuelve un valor TRUE FALSO
	}
}
