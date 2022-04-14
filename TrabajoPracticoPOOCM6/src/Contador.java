/*
 * Crea una clase llamada Contador que contenga un único atributo entero llamado
cont. La clase tendrá los siguientes constructores: Constructor por defecto
Constructor con parámetros para inicializar el contador con un valor no negativo. Si
el valor inicial que se recibe es negativo el contador tomará el valor cero como valor
inicial. Constructor copia. Además de los métodos getter y setter, la clase contendrá
los métodos: incrementar: incrementa el contador en una unidad. decrementar:
decrementa el contador en una unidad. El contador nunca podrá tener un valor
negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor
cero.
 */
public class Contador {
	
	private int contador;
	
	public Contador(int contador) {
		if(contador >= 0) 
		{
			this.contador = contador;
		}
		
		if(contador < 0) 
		{
			this.contador = 0;
		}
	}

	public Contador() {
	}
	
	public Contador(Contador contador) 
	{
		this.contador = contador.contador;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void incrementar() 
	{
		this.contador = this.contador + 1;
	}
	
	public void decrementar() 
	{
		this.contador = this.contador - 1;
		if(this.contador < 0) 
		{
			this.contador = 0;
		}
	}
}
