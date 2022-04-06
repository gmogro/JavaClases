/*
 * Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
impar)"*/
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 345;
		
		if((numero % 2 == 0))
		{
			System.out.println("Par"+ numero);
		}
		else 
		{
			System.out.println("Impar" + numero);
		}
	}

}
