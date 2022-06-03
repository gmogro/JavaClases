import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	
	private String path;
	
	public Archivo(String path) 
	{
		this.path = path;
	}
	
	public void crearArchivo() 
	{
		File archivo = new File(this.path);
		
		if(!archivo.exists()) 
		{
			try{
				archivo.createNewFile();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Archivo existe");
		}	
	}
	
	public void leerArchivo() 
	{
		FileReader archivo = null;
        BufferedReader texto = null;
        
        try{
            //var "direccion contiene el path de donde esta almacenado el archivo"
            archivo = new FileReader(this.path);
            texto = new BufferedReader(archivo);
            
            String lectura ="";
            System.out.println("El path del archivo es: "+ this.path);
            System.out.println("Contenido del archivo:");
            while((lectura=texto.readLine())!=null){
                System.out.println(lectura);//Muestra linea por linea del archivo
            }
        }catch(FileNotFoundException e){
            System.out.println("archivo no encontrado");// muestra un msj de error si no 
                                                          // encuentra el archivo

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
	
	public void escribirArchivo(String textoOut) 
	{
		FileWriter archivo = null;
        BufferedWriter texto = null;
		
        try {
			archivo = new FileWriter(this.path);
			texto = new BufferedWriter(archivo);
	        texto.write("Modificando el archivo");
	        texto.newLine(); //salto de linea
	        texto.write("Salto de linea");
	        texto.flush(); // guarda las modificaciones
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally{
            try{ 
            	//cerramos los flujos abiertos
                texto.close();
                archivo.close();
            }catch(IOException e){
                System.out.println("Error! "+e.getMessage());
            }
        }
	}
	
	
	
}















