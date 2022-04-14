/*Ejercicio N° 2
Crear una clase llamada serie con los atributos: titulo, números de temporadas,
género y creador. Con los siguientes métodos: Constructor, mostrar todos los
atributos, sobrescribir todos los atributos.*/

public class Serie {
	
	private String titulo;
	private int temporada;
	private String genero;
	private String creador;
	
	public Serie() 
	{
		this.titulo="";
		this.temporada=0;
		this.genero="";
		this.creador="";
	}
	
	public Serie(String titulo,int temporada,String genero, String creador) 
	{
		this.titulo=titulo;
		this.temporada=temporada;
		this.genero=genero;
		this.creador=creador;
	}
	
	public void mostrar() 
	{
		System.out.println(this.titulo);
		System.out.println(this.temporada);
		System.out.println(this.genero);
		System.out.println(this.creador);
	}
	
	public void override(String titulo,int temporada,String genero, String creador) 
	{
		this.titulo=titulo;
		this.temporada=temporada;
		this.genero=genero;
		this.creador=creador;
	}
	//SETERS Y GETTERS
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
	
	public String getTitulo() 
	{
		return this.titulo;
	}
	
	public void setTemporada(int temp) 
	{
		this.temporada = temp;
	}
}
