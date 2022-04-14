/*
 * Ejercicio N° 1
Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio.
Con los métodos: Constructor y un método que permita mostrar la información de la
persona.
*/
public class Persona {
	
	//SECCION DE ATRIBUTOS
	private String nombre;
	private String apellido;
	private String dni;
	private String domicilio;
	//
	//seccion de Metodos
	public Persona() //contructor por default
	{
		this.nombre = "";
		this.apellido = "";
		this.dni = "";
		this.domicilio = "";
	}
	
	public Persona(String nombre,String apellido,String dni, String domicilio) //contructor comun (Sobrecargar contructor Persona)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public void mostrar() 
	{
		System.out.println("LO DATOS DE PERSONA SON: ");
		System.out.println("NOMBRE : "+ this.nombre);
		System.out.println("APELLIDO : "+ this.apellido);
		System.out.println("DNI: "+ this.dni);
		System.out.println("DOMICILIO: "+this.domicilio);
	}
}
