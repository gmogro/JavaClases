/*
 Ejercicio N� 6
Crea una clase DirectorCine con los atributos nombre (String), apellido(String) y edad
(int). Crea los m�todos get y set para los atributos. Crea el m�todo constructor que
tenga como par�metros cada uno de sus atributos. Luego crea otra clase llamada
testEjercicio con el m�todo main y sigue los siguientes pasos:
1) En el main, crea tres objetos DirectorCine que tengan como atributos
respectivamente:
Pedro, G�mez, 31.
Juan, Su�rez, 55.
Elena, Albucar, 29.
2) Crea un ArrayList de objetos DirectorCine.
3) A�ade los tres objetos DirectorCine al ArrayList usando el m�todo add
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
