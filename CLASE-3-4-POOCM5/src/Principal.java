import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//ejercicio1
		/*Raices raice = new Raices(5,60,3);
		raice.setB(5);
		if(raice.getDiscriminante()>=0) 
		{
			raice.obtenerRaices();
		}
		else {
			System.out.println("imaginario");
		}*/
		
		//ejercicio2
		//Persona persona1 = new Persona("Guillermo","Mogro","11111111");
		//Cuenta cuenta1 = new Cuenta(persona1,9000);
		
		//Ejercicio3
		//Persona persona1 = new Persona("Guillermo","Mogro","11111111");
		//System.out.println(persona1);
		//Empleado empleado = new Empleado(persona1,28000);
		//String nombreEmpleado = empleado.getEmpleado().getNombre();
		
		//Ejercicio4
		//Producto producto =new Producto();
		//Producto producto1 =new Producto();
		//Producto producto2 =new Producto();
		//Producto producto3 =new Producto();
		
		//ArrayList<Producto> lista = new ArrayList<Producto>();
		
		//lista.add(producto);
		//lista.add(producto1);
		//lista.add(producto2);
		//lista.add(producto3);
		
		
		//for(int i=0;i<lista.size();i++) 
		//{
			//System.out.println("TOTAL : " + lista.get(i).calcular(5));
		//}
		
		//int id, String nombre, String categoria, double precio, int stock
		Scanner sc = new Scanner(System.in);
		int corte = 1;
		while(corte == 1) 
		{
			System.out.println("Ingrese el id");
			int id = sc.nextInt();
			System.out.println("Ingrese el Nombre del producto");
			String nombre = sc.nextLine();
			sc.nextLine();
			System.out.println("Ingrese el Categoria");
			String categoria = sc.nextLine();
			System.out.println("Ingrese el precio");
			double precio = sc.nextDouble();
			System.out.println("Ingrese el precio");
			int cantidad = sc.nextInt();
			
			Producto7 producto = new Producto7(id,nombre,categoria,precio,cantidad);
			
			System.out.println("Vender opcion 1");
			System.out.println("Comprar opcion 2");
			int opcion = sc.nextInt(); 
			if(opcion == 1) {
				//llamar a validar stock
				sc.nextLine();
				System.out.println("Ingrese el Categoria a vender");
				String categoriaVender = sc.nextLine();
				System.out.println("Ingrese el cantidad a vender");
				int cantidadVender = sc.nextInt();
				producto.vender(categoriaVender, cantidadVender);
			}
			if(opcion == 2) {
				sc.nextLine();
				System.out.println("Ingrese el Categoria a comprar");
				String categoriaComprar = sc.nextLine();
				System.out.println("Ingrese el cantidad a comprar");
				int cantidadComprar = sc.nextInt();
				producto.comprar(categoriaComprar, cantidadComprar);
			}
			
			
			System.out.println("Ingresa mas producto");
			System.out.println("Ingresa 0 salir - 1 seguir");
			corte = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
