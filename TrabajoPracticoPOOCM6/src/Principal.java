public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		//ejercicio2
		Serie serie1 = new Serie("The good Doctor",5,"Drama","anonimo");
		Serie serie2 = new Serie("Vikingos",5,"Accion","anonimo2");
		
		//Ejercicio 3
		NumeroEntero entero1 = new NumeroEntero(167); 
		//System.out.println(entero1.getA());
		entero1.setA(0);
		
		NumeroEntero entero2 = new NumeroEntero(568);
		
		//System.out.println(entero1.suma(entero2));
		//System.out.println("suma comutativa");
		//System.out.println(entero2.suma(entero1));
		
		//System.out.println(entero1.resta(entero2));
		//System.out.println("¿Resta comutativa?");
		//System.out.println(entero2.resta(entero1));
		
		//System.out.println(entero1.producto(entero2));
		//System.out.println("producto comutativa");
		//System.out.println(entero2.producto(entero1));
		
		//System.out.println(entero1.division(entero2));
		//System.out.println("Division");
		//System.out.println(entero2.division(entero1));
		
		
		//Ejercicio 4
		
		Contador contador1 = new Contador(0);
		Contador contador2 = new Contador(50);
		
		for(contador1.getContador(); contador1.getContador() < 5;contador1.incrementar()) 
		{
			System.out.println("decrementa contador: ");
			contador2.decrementar();
			System.out.println(contador2.getContador());
		}
		
	}

}
