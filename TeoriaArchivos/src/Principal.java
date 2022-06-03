
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archivos archivo = new Archivos("fichero.txt");
		
		archivo.creaArchivo();
		archivo.escribirArchivo();
		archivo.leerArchivo();
	}

}
