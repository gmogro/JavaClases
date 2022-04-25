/*: Nombre, precios, vencimiento, con 2 tipos
de productos perecederos y no perecederos.*/

public class Producto {
	
	private String nombre;
	private double precio;
	private int vencimiento;
	private boolean tipo;
	
	public Producto(String nombre,double precio,boolean tipo) 
	{
		this.nombre = nombre;
		this.precio = precio;
		if(tipo) 
		{
			//ingrese lo dias de vencimiento
		}
		
	}
	
}
