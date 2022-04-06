/*
 *Ejercicios de triangulos
 **/
public class EjercicioTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sentecias de declaracion
		int ladoTest;
		
		//sentecias de asignacion
		int lado1 = 5;
		int lado2 = 10;
		int lado3 = 10;
		
		/*
		  
		*/
		//&& and logico y logico
		//if = SI
		// == compara si dos variables son iguales
		// != compara si dos variables son distintas
		// System.out.println(""); muestra informacion por pantalla
		// || o logico ;
		if( lado1 == lado2 && lado2==lado3 && lado1 == lado3) {
			System.out.println("ES EQUILATERO");
		}
		else {
			if(lado1 != lado2 && lado2 !=lado3 && lado1 != lado3) {
				System.out.println("ES ESCALENO");
			}
			else {
				System.out.println("ES ISOCELES");
			}
		}
		
		
	}
}
