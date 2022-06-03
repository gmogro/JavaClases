
public class TestRecursion {

	public static void main(String[] args) {
		clsRecursion prueba=new clsRecursion(344);
		//System.out.println();
		String cadena="Se van sus nave";
		if(prueba.esPalindromo(cadena))
			System.out.println("palindromo");
		else System.out.println("no es");
	}

}
