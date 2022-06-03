import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		System.out.println("Soy un for");
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("soy Iterator");
		Iterator<String> iter= lista.iterator();
		
		while(iter.hasNext()) 
		{
			System.out.println(iter.next());
		}
	}

}
