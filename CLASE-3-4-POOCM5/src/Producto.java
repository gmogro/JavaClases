
import java.util.Date;

/*: Nombre, precios, vencimiento, con 2 tipos
de productos perecederos y no perecederos*/


public class Producto {
	
	private String nombre;
	private double precio;
	private int vencimiento; //22082022
	private boolean tipo;

	public Producto() {
	}
	public Producto(String nombre, double precio, int vencimiento, boolean tipo) {
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}
	public boolean getTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	/*función llamada calcular: en producto simplemente seria calcular
precio por cantidad, en perecederos el precio se reducirá según los días a
caducar, si le queda 1 día se reducirá 4 veces el precio, si le quedan 2 días se
reducirá el precio 3 veces, si le quedan 3 días se reducirá la mitad el precio.
Crear una clase ejecutable y crear un array de productos y muestra el precio
*/
	public double calcular(int cantidad) 
	{
		double total;
		if (this.getTipo()) {
			switch(this.getVencimiento()) 
			{
				case 1:
					return total = (this.getPrecio()/4)*cantidad;
				case 2:
					return total = (this.getPrecio()/3)*cantidad;
				case 3:
					return total = (this.getPrecio()/2)*cantidad;
				default:
					return total = 0;
				}	
			}
		else {
			return 0;
		}
		
		/*double total = 0;
		if(this.perecederos) {
			if(this.vencimiento<=1) {
				total=(this.precio/4)*cantidad;
			}
			else {
				if(this.vencimiento==2) {
					total=(this.precio/3)*cantidad;
				}
				else {
					if(this.vencimiento==3) {
						total=(this.precio/2)*cantidad;
					}
				}
			}
		total=this.precio*cantidad;
			
		}
		return total;*/
	}
}
