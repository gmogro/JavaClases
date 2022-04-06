/*
 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo. Asigne
a dividendo el valor 25 y a la variable divisor el valor 10. muestre el resto (%) de la division
entre dividendo y divisor. Luego a dividendo asigne el valor 25/10. Y vuelva a mostrar el
resto entre dividendo y divisor.*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divisor = 10;
		int dividiendo = 25;
		int resto = dividiendo % divisor;
		System.out.println("RESTO: "+ resto);
		
		dividiendo = dividiendo/divisor;
		
		int resultado = dividiendo % divisor;
		System.out.println("RESTO: "+ resultado);
		
		
	}

}
