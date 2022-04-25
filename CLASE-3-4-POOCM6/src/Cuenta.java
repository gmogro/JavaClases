
public class Cuenta {
	//atributos
	private Persona titular;
	private double cantidad;
	
	public Cuenta() {}
	public Cuenta(Persona titular,double cantidad) 
	{
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void mostrar() 
	{
		System.out.println("Nombre Completo "+ this.getTitular().getNombreCompleto());
		System.out.println("Documento : " + this.getTitular().getDocumento());
		System.out.println("Cantidad : " + this.getCantidad());
	}
	
	public void ingresar(double cantidad) 
	{
		//codificar
	}
	
	public void retirar(double cantidad) 
	{
		//codificar
	}
	
}
