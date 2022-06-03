
public class PrincipalCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cola cola = new Cola(10);
		
		cola.meter(100);
		cola.meter(1);
		cola.meter(1325);
		cola.meter(7);
		
		while(!cola.estaVacia()) 
		{
			System.out.println(cola.sacar());
		}
	}
	

}
