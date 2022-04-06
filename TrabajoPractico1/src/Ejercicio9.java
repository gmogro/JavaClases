/*
 Dados tres números, mostrarlos ordenados ascendentemente
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 34;
		int numero2 = 2;
		int numero3 = 45;
		int mayor;
		int menor;
		
		if(numero1>numero2 && numero1>numero3) {
			mayor = numero1;
		}
		else {
			if(numero2>numero1 && numero2>numero3) {
				mayor = numero2;
			}
			else {
				mayor = numero3;
			}
		}
		
		if(numero1<numero2 && numero1<numero3) {
			menor = numero1;
		}
		else {
			if(numero2<numero1 && numero2<numero3) {
				menor = numero2;
			}
			else {
				menor = numero3;
			}
		}
		
		int medio = (numero1+numero2+numero3) - (mayor+menor);
		
		System.out.print(menor+",");
		System.out.print(medio+",");
		System.out.print(mayor);
		
	}

}
