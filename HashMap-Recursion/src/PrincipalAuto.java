import java.util.HashMap;

public class PrincipalAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Auto> autos = new HashMap<String, Auto>();
		
		Auto auto = new Auto("Rojo","Toyota",5);
		Auto auto2 = new Auto("Azul","Chevrolet",3);
		Auto auto3 = new Auto("Blanco","Fiat",3);
		
		autos.put("KJJ531", auto);
		autos.put("LWN789", auto2);
		autos.put("AB137KK", auto3);
		
		autos.get("KJJ531").encender();
		
		/*for(String elemento: autos.keySet()) 
		{
			System.out.println(elemento);
		}*/
		//autos.remove("AB137KK");
		
		//autos.clear();
		
		/*for(Auto elemento: autos.values()) 
		{
			elemento.mostrar();
			System.out.println();
		}*/
		
		for (String i : autos.keySet()) {
			System.out.println("Clave: " + i + " Valor: " );
			autos.get(i).mostrar();
		}
	}

}
