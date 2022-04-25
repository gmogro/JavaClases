
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Raices raiz = new Raices(); //objeto instanciado por el contructor por defecto
		Raices raiz2 = new Raices(1,0,1);//objeto instanciado por el contructor comun
		//double coeficienteA = raiz2.getA();
		//System.out.println("Coeficiente A : "+ coeficienteA);
		//raiz2.setA(1.1);
		//raiz2.obtenerRaices();
		
		//Ejercicio2
		Persona persona = new Persona("Mogro Guillermo","11111111");
		Cuenta cuenta = new Cuenta(persona,1000);
		cuenta.mostrar();
		
		cuenta.ingresar(50);
		cuenta.retirar(60);
	}

}
