/*Defina una clase Auto con los atributos color, cantidad de puertas, marcas y
un boolean que indica si el auto esta encendido(true) o apagado(false) por defecto
al crear un auto este se encuentra apagado. Además implementar 3 métodos:
mostrar() el cual muestra todos los valores de los atributos de un auto,el encender()
y moverse(). Luego defina una clase que contenga al método main e instancie 3
objetos de la clase auto y cree un HashMap cuya clave sea de tipo String el cual
representa la matrícula del auto, y el valor sea la clase Auto. Finalmente pruebe
todas las operaciones expuestas en teoría sobre HashMap.
*/
public class Auto {
	
	private String color;
	private String marca;
	private int cantidadPuertas;
	private boolean encendido;
	
	public Auto(String color, String marca, int cantidadPuertas) {
		this.color = color;
		this.marca = marca;
		this.cantidadPuertas = cantidadPuertas;
		this.encendido = false;
	}
	
	public void encender() 
	{
		if(!this.encendido) 
		{
			this.encendido = true;
			System.out.println("Encendiste el auto");
		}
		else {
			System.out.println("el auto esta encendido");
		}
	}
	
	public void moverse() 
	{
		if(this.encendido) 
		{
			System.out.println("Auto se moviendo");
		}
		else {
			System.out.println("Encienda el auto");
		}
	}
	
	public void mostrar() 
	{
		System.out.println("Color: "+ this.color);
		System.out.println("Marca: "+ this.marca);
		System.out.println("Cantidad de puertas : "+ this.cantidadPuertas);
		System.out.println("esta encendido? "+ this.encendido);
	}
}





















