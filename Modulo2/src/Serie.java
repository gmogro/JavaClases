/*Ejercicio N° 2
Crear una clase llamada serie con los atributos: titulo, números de temporadas,
género y creador. Con los siguientes métodos: Constructor, mostrar todos los
atributos, sobrescribir todos los atributos.*/

public class Serie {
	
	//Seccion de Atributos
	private String titulo;
	private int temporada;
	private String genero;
	private String creador;
	
	public Serie() 
	{
		
	}
	public Serie(String titulo,int temporada,String genero,String creador) 
	{
		this.titulo = titulo;
		this.temporada = temporada;
		this.genero = genero;
		this.creador = creador;
	}
	
	public void mostrarAtributos() 
	{
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Temporada: "+this.temporada);
		System.out.println("Genero: "+this.genero);
		System.out.println("Creador: "+this.creador);
	}
	
	public void sobreescribir(String titulo,int temporada,String genero,String creador) 
	{
		this.titulo = titulo;
		this.temporada = temporada;
		this.genero = genero;
		this.creador = creador;
	}
	
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
}
