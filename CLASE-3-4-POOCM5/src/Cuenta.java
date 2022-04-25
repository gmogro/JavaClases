/*Crear una clase llamada Cuenta que tendr� los atributos: titular (que es una persona)
y cantidad (puede tener decimales). El titular ser� obligatorio y la cantidad es
opcional. Construye los siguientes m�todos para la clase:
 Un constructor;
 mostrar(): Muestra los datos de la cuenta;
 ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad
introducida es negativa, no se har� nada;
 retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en
n�meros rojos.
*/
public class Cuenta {
	
	private Persona titular;
	private double cantidad;
	
	public Cuenta() 
	{}
	
	public Cuenta(Persona titular,double cantidad) 
	{
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	
}
