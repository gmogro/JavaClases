public class Persona {
	//seccion es de atributos (CARACTERISTICAS)
	private String nombre;
	private String apellido;
	private int edad;
	private String domicilio;
	
	// contructor por defecto
	public Persona() 
	{
		this.apellido = "";
		this.nombre = "";
		this.edad = 0;
		this.domicilio = "";
	} 
	
	//contructor es el comun
	public Persona(String nombre, String apellido, int edad, String domicilio) 
	{
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
	}
	
	//GETTERS Y SETERS
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getNombre() 
	{
		return this.nombre;
	}

	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("hola"); 
	}
}
