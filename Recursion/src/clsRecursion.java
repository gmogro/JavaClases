
public class clsRecursion {
	//atributos
	private int valor;
	//metodos
	public int getvalor(){
		return this.valor;
		
	}
	public void setvalor(int valor){
		this.valor=valor;
	}
	//contructor
	public clsRecursion(int valor){
		setvalor(valor);
	}
	
	public int getfactorial(){
		return factorial(getvalor());
	}
	private int factorial(int n){
		if(n==0){return 1;}
		else return n*factorial(n-1);
	}
	public boolean esPar(int n){
		return par(n);
	}
	public boolean esImpar(int n){
		return impar(n);
	}
	private boolean par(int n){
		if(n==0) return true;
		else return impar(n-1);
	}
	private boolean impar(int n){
		if(n==0) return false;
		else return par(n-1);
	}
	public int resto(int b){
		return getresto(getvalor(),b);
	}
	private int getresto(int a,int b){
		if(a<b)
			return a;
		else return getresto(a-b,b);
	}
	public int cociente(int b){
		return getcociente(getvalor(),b);
	}
	public int getcociente(int a,int b){
		if(a<b)
			return 0;
		else return 1+getcociente(a-b,b);
	}
	//ejercicio1tp4
	public int potencia(int b){
		return getpotencia(getvalor(),b);
	}
	private int getpotencia(int a,int b){
		if(b==1)
			return a;
		else return a*getpotencia(a,b-1);
	}
	//ejercicio2tp4
	public boolean primo(){
		return getprimo(getvalor());
	}
	private boolean getprimo(int a){
			if(Math.abs(getvalor())<=1)
				return false;
			else {if (getvalor()%2==0){
					if(getvalor()==2)
						return true;
					else return false;
					}
				else {return aux(getvalor(),3);}
		}
}
	private boolean aux(int a,int pd){
			if(getpotencia(pd,2)>=getvalor())
				return true;
			else if((resto(pd)==0))
					return false;
				else return aux(getvalor(),pd+2);
	}
	//ejercicio3tp4
	public int sumadigitos(){
		return getsumadigitos(getvalor());
	}
	private int getsumadigitos(int a){
			if(a<10)
				return a;
			else return getresto(a,10)+getsumadigitos(getcociente(a,10));
	}
	//ejercicio4tp4
	public int cambiabase(int base){
		return getcambiobase(getvalor(),base);
	}
	private int getcambiobase(int valor ,int base){
			if(valor<base)
				return valor;
			else return getresto(valor,base)+10*getcambiobase(getcociente(valor,base),base);
	}
	//ejercicio5tp4
	public int mcd(int a,int b){
		if(b==0)
			return Math.abs(a);
		else return mcd(b,getresto(a,b));

	}
	//ejercicio6tp4
	public boolean divisiblepor11(){
		return (getcociente(getdivisiblepor11(getvalor(),0),11)==0);
	}
	private int getdivisiblepor11(int valor , int k){
		if(valor<10)return valor;
		else return (getresto(valor,10)*(int)Math.pow(-1,k)+getdivisiblepor11(getcociente(valor,10),k+1));
	}
	//ejercicio7tp4
	public void factoresprimos(int valor){
			getfactoresprimos(valor,3);
	}
	private void getfactoresprimos(int valor,int i){
		if (valor>1){
				if(getresto(valor,2)==0){
					System.out.print(" 2 ");
					getfactoresprimos(getcociente(valor,2),3);
				}
				else {if(getresto(valor,i)==0){
							System.out.print(i);
							getfactoresprimos(getcociente(valor,i),3);}
					  else {getfactoresprimos(valor,i+2);}
						}
	}
		else {System.out.print(" 1 ");}
}//metodo getfactoresprimos
	
public boolean Palindromo(String cadena){
			if(cadena==null)
					return false;
			else {if(cadena.length()<2)
					return true;
				  else {if(cadena.charAt(0) == cadena.charAt(cadena.length()-1))
					  		return Palindromo(cadena.substring(1,cadena.length()-1));
				  		else return false;
				  }
			}
	}
public boolean esPalindromo(String cadena){
	String aux;
		aux=cadena.toLowerCase();
		aux=aux.replaceAll(" ","");
		return Palindromo(aux);
}
}//clase

