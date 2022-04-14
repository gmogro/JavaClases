
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner sc = new Scanner(System.in);
		
		//Persona persona1 = new Persona();
		//persona1.setNombre("Guillermo");
	
		//Persona persona2 = new Persona("Guillermo","Mogro",30,"Caseros 15");
		
		//Serie serie1 = new Serie("The good doctor",5,"Drama","anonimo");
		
		//serie1.mostrarAtributos();
		//serie1.sobreescribir("El doctor milagros",3,"Drama","anonimo2");
		
		Cuenta cuenta1 = new Cuenta("Guillermo","124124",21,10);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println("-------");
		if(!cuenta1.ingreso(54)) {
			System.out.println("No se pudo realizar la transacion");
		}
		System.out.println(cuenta1.getSaldo());
		System.out.println("---------");
		if(!cuenta1.reintegro(43.2)) 
		{
			System.out.println("No se pudo realizar la transaccion");
		}
		System.out.println(cuenta1.getSaldo());
		
		
	}

}
