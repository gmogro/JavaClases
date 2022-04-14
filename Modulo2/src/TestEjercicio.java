import java.util.ArrayList;

/*
 * 1) En el main, crea tres objetos DirectorCine que tengan como atributos
respectivamente:
Pedro, Gómez, 31.
Juan, Suárez, 55.
Elena, Albucar, 29.
2) Crea un ArrayList de objetos DirectorCine.
3) Añade los tres objetos DirectorCine al ArrayList usando el método add*/
public class TestEjercicio {
	public static void main(String[] args) {
		
		//Instanciamos (creamos objetos del tipo DirectorCine)
		DirectorCine tarantino = new DirectorCine("Pedro","Gomez",31);
		DirectorCine almodovar = new DirectorCine("Juan","Suarez",55);
		DirectorCine elena = new DirectorCine("Elena","Albucar",29);

		ArrayList<DirectorCine> listaDirectores = new ArrayList<DirectorCine>();
		//agregamos en nuestra lista todos los objetos anteriores creados
		listaDirectores.add(tarantino);
		listaDirectores.add(almodovar);
		listaDirectores.add(elena);
		
		for(int i=0;i<listaDirectores.size();i++) 
		{
			System.out.println("Director: ");
			System.out.print(""+ listaDirectores.get(i).getNombre());
			System.out.print(" - "+ listaDirectores.get(i).getApellido());
			System.out.print(", "+ listaDirectores.get(i).getEdad());
			System.out.println();
		}
		
	}
}
