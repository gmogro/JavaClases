/*
 Ejercicio N° 6
Crea una clase DirectorCine con los atributos nombre (String), apellido(String) y edad
(int). Crea los métodos get y set para los atributos. Crea el método constructor que
tenga como parámetros cada uno de sus atributos. Luego crea otra clase llamada
testEjercicio con el método main y sigue los siguientes pasos:
1) En el main, crea tres objetos DirectorCine que tengan como atributos
respectivamente:
Pedro, Gómez, 31.
Juan, Suárez, 55.
Elena, Albucar, 29.
2) Crea un ArrayList de objetos DirectorCine.
3) Añade los tres objetos DirectorCine al ArrayList usando el método add
*/

public class DirectorCine {
	
	//Seccion Atributos
	private String nombre;
	private String apellido;
	private int edad;
	//
	
	public DirectorCine() 
	{
		
	}
	
	public DirectorCine(String nombre, String apellido, int edad) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
