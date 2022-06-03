
public class Pila {
	private int[] pila;
	private int tope;
	private int tamPila;
	
	public Pila(int tamPila) 
	{
		this.pila = new int[tamPila];
		this.tamPila = tamPila;
		this.tope = -1;
	}
	
	public boolean estaVacia() 
	{
		return this.tope == -1;
	}
	
	public boolean estaLlena() 
	{
		return this.tope == this.pila.length - 1;
	}
	
	public int sacar() 
	{
		int elemento;
		
		if(!this.estaVacia()) 
		{
			elemento = this.pila[this.tope];
			this.tope = this.tope - 1;
		}
		else {
			System.out.println("La pila no tiene elemento");
			elemento = 0;
		}
		
		return elemento;
	}
	
	public void meter(int elemento) 
	{
		if(!this.estaLlena()) 
		{
			this.tope = this.tope + 1;
			this.pila[this.tope] = elemento;
		}
		else 
		{
			System.out.println("Pila llena");
		}
	}
	
	public int tope() 
	{
		return this.pila[this.tope];
	}
}















