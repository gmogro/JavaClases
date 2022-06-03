
public class PrincipalPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pila pila = new Pila(10);
		
		pila.meter(2);
		pila.meter(100);
		pila.meter(45);
		pila.meter(67);
		pila.meter(100000);
		
		System.out.println(pila.tope());
		System.out.println(pila.sacar());
		System.out.println(pila.tope());
	}

}
