import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*jercicio Nro 5
Crear un fichero de texto con el nombre y contenido que tú desees. Por
ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin
espacios.
Ejemplo:
Si el fichero contiene el siguiente texto “Hola que haces”, deberá mostrar
“Holaquehaces”.
sugerencia: usar la función ready() de BufferedReader (implementarla para saber lo
que hace)
*/
public class Ficheros {
	
	private String direccion;
	
	
	public Ficheros() {
	}

	public Ficheros(String direccion) 
	{
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void crearArchivo() 
	{
		File archivo = new File(this.direccion);
		
		if(!archivo.exists()) 
		{
			try {
				archivo.createNewFile();
				System.out.println("el file fue creado con exito");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("El archivo existe");
		}
	}
	
	public void leerArchivo() 
	{
		FileReader archivo = null;
		BufferedReader texto = null;
		try{
			archivo = new FileReader(this.direccion);
			texto = new BufferedReader(archivo);
			String lectura = "";
			int caracter = 0;
			while(texto.ready()) 
			{
				caracter = texto.read();
				if(caracter != 32 ) 
				{
					lectura = lectura + (char)caracter;
				}
			}
			System.out.println(lectura);
		}catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo");
		}catch(IOException e){
            System.out.println("Error! "+e.getMessage());// muestra un msj de error si no 
            // puede abrir el archivo
		}
		finally{
			try{ //cerramos los flujos abiertos
				texto.close();
				archivo.close();
			}catch(IOException e){
				System.out.println("Error! "+e.getMessage());
			}
		}
		
		
	}
}


















