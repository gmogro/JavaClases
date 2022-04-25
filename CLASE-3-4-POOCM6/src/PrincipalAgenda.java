import java.util.Scanner;

public class PrincipalAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Crea un menú con opciones por consola para probar todas estas
		 funcionalidades.
		*/
		Agenda agenda = new Agenda(20);
		Scanner sc = new Scanner(System.in);
		int corte = 1;
		while(corte == 1) 
		{
			System.out.println("selecione opcion");
			System.out.println("1 - Agregar un contacto");
			System.out.println("2 - Eliminar un contacto");
			System.out.println("3 - Buscar un contacto");
			System.out.println("4 - Listar todos los contactos");
			int opcion = sc.nextInt();
			sc.nextLine();
			if(opcion == 1) 
			{
				System.out.println("Ingresa el Nombre : ");
				String nombre = sc.nextLine();
				System.out.println("Ingresa el Telefono : ");
				String telefono = sc.nextLine();
				//Instanciamos contacto
				Contacto contacto = new Contacto(nombre,telefono);
				//agregamos en agenda
				agenda.aniadirContacto(contacto);
			}
			
			if(opcion == 2) 
			{
				System.out.println("Ingresa el Nombre : ");
				String nombre = sc.nextLine();
				//eliminar en agenda
				agenda.eliminiarContacto(nombre);
			}
			
			if(opcion == 3) 
			{
				System.out.println("Ingresa el Nombre : ");
				String nombre = sc.nextLine();
				//eliminar en agenda
				agenda.buscaContacto(nombre);
			}
			
			if(opcion == 4) 
			{
				agenda.listarContactos();
			}
			
			System.out.println("selecione opcion");
			System.out.println("0 - Salir");
			System.out.println("1 - Seguir");
			corte = sc.nextInt();
			
		}
	}

}
