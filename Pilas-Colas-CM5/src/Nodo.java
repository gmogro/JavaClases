
public class Nodo {
	private int elemento;
	private Nodo next;
	
	
	public Nodo(int elemento, Nodo next) {
		super();
		this.elemento = elemento;
		this.next = next;
	}
	
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	public Nodo getNext() {
		return next;
	}
	public void setNext(Nodo next) {
		this.next = next;
	}
}
