
public class Cola {
	private int[] cola;
	private int finalC;
	private int incioC;
	private int tamCola;
	
	public Cola (int tamCola)
	{
		this.cola = new int[tamCola];
		this.finalC = -1;
		this.incioC = -1;
		this.tamCola = tamCola;
	}
	
	public boolean estaVacia() 
	{
		return this.finalC == -1;
	}
	
	public boolean estaLlena() 
	{
		return this.finalC == this.cola.length - 1;
	}
	
	public void meter(int elemento) 
	{
		if(!this.estaLlena()) 
		{
			if(this.incioC == -1) {
				this.incioC = this.incioC + 1;
			}
			this.finalC = this.finalC + 1;
			this.cola[this.finalC] = elemento;
		}
		else {
			System.out.println("No hay mas lugar en la cola");
		}
	}
	
	public int[] getCola() {
		return cola;
	}

	public void setCola(int[] cola) {
		this.cola = cola;
	}

	public int getTamCola() {
		return tamCola;
	}

	public void setTamCola(int tamCola) {
		this.tamCola = tamCola;
	}

	public int sacar() 
	{
		int elemento;
		if(!this.estaVacia()) 
		{
			elemento = this.cola[this.incioC];
			this.incioC = this.incioC + 1;
		}
		else {
			System.out.println("la cola esta vacia");
			elemento = 0;
		}
		
		return elemento;
	}
	
	public int devolverIncioCola() 
	{
		return this.cola[this.incioC];
	}
}


