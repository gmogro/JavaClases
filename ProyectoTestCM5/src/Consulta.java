/*

 */
import java.util.Scanner;//importante 

public class Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<5;i++) 
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingresa un Numero real : ");
			double real = teclado.nextDouble(); 
			System.out.println(real);
		}
		
		int i = 0;
		while(i<5) 
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingresa un Numero real : ");
			double real = teclado.nextDouble(); 
			System.out.println(real);
			i++;
		}
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un Numero real : ");
		double real = teclado.nextDouble(); 
		System.out.println("Ingresa un Numero real2 : ");
		double real2 = teclado.nextDouble(); 

		
		/*
		 operadores +,-,/,*,%(el resto de la division)
		 operadores relacionales <,>, == (si son iguales),!=(si son distintos),=>
		 operadores logico && and, || or , ! negacion 
		 */
		/*
		 *  * Declarar dos variables, asignar un valor cualquiera y realizar las siguientes operaciones:
			Mostrar la suma
			Mostrar la multiplicacion
			Mostrar la resta
			Mostrar Division
		*/
		/*double numero = 1000 ;
		double numero2 = 1234;
		double resultadoSuma = numero + numero2;
		System.out.println("El resultado de la suma es :" + resultadoSuma);
		double resultadoResta = numero - numero2;
		System.out.println("El resultado de la resta es :" + resultadoResta);
		double resultadoProducto = numero * numero2;
		System.out.println("El resultado de la producto es :" + resultadoProducto);
		double resultadoDivision = numero / numero2;
		System.out.println("El resultado de la division es :" + resultadoDivision);*/
		
		
		
		/*Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
		par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
		impar)"*/
		
		//SCANNER
		int numero = 12432;
		
		if(numero % 2 == 0) 
		{
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		/*Declare dos variables de tipo flotante, asigne un valor a cada una, calcule el promedio y
		muestrelo por consola.*/
		
		double real1 = 1234.43;
		double real5 = 456.89;
		//probar ciclo for ver acumulador y contador
		double suma = real1 + real5;
		double promedio = suma / 2;
		
		System.out.println(promedio);
		
		/*
		 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo. Asigne
		   a dividendo el valor 25 y a la variable divisor el valor 10. muestre el resto (%) de la division
		   entre dividendo y divisor. Luego a dividendo asigne el valor 25/10. Y vuelva a mostrar el
		   resto entre dividendo y divisor.
		 */
		
		/*int divisor = 25;
		int dividiendo = 10;
		int resto = divisor % dividiendo;
		System.out.println("Resto : "+resto);
		
		divisor = divisor % dividiendo;
		resto = divisor % dividiendo;
		System.out.println("Resto : "+resto);*/
		
		/*
		 Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
		 por el usuario.
		 */
		//usar scanner
		/*int segundos = 5000;
		int minutos = 5000/60;
		System.out.println("Minutos : "+minutos);*/
		
		/*
		 Dados tres números, mostrarlos ordenados ascendentemente
		 */
		double numero1 = 345.60;
		double numero2 = 99.45;
		double numero3 = 12.60;
		//12.60 99.45 345.60
		if(numero1<numero2 && numero1<numero3)
		{
			System.out.println(numero1);
			if(numero2<numero3){
				System.out.println(numero2);
				System.out.println(numero3);
			}
		}
		
		if(numero2>numero1 && numero2>numero3)
		{
			System.out.println(numero2);
			if(numero1>numero3){
				System.out.println(numero1);
				System.out.println(numero3);
			}
		}
		
		if(numero3<numero2 && numero3<numero1)
		{
			System.out.println(numero3+",");
			if(numero2<numero1){
				System.out.println(numero2+",");
				System.out.println(numero1);
			}
		}
		
	}

}
