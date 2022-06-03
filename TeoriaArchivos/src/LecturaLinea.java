import java.io.IOException;

public class LecturaLinea {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c;
		int contador = 0;
		System.out.println("Se lee hasta encontrar el fin de linea");
		while((c = System.in.read()) != '\n') 
		{
			contador ++;
			System.out.println("Lo que interpreta el compilador "+ c);
			System.out.println("lo ve la persona "+(char) c);
		}
		System.out.println("");
		System.out.println("Contador "+ contador + " bytes en total");
	}

}
