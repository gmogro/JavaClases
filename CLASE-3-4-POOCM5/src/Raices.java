/*
 * Ejercicio N° 1
Vamos a realizar una clase llamada Raíces, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:
 obtenerRaices(): imprime las 2 posibles soluciones
 obtenerRaiz(): imprime una única raíz, que será cuando solo tenga una
solución posible.
 getDiscriminante(): devuelve el valor del discriminante (double), el
discriminante tiene la siguiente fórmula, (b^2)-4ac
 tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 calcular(): mostrará por consola las posibles soluciones que tiene nuestra
ecuación, en caso de no existir solución, mostrarlo también.
Fórmula ecuación 2º grado: (-b±√((b^2)-(4ac)))/(2*a)
Solo varía el signo delante de -b*/


// ax2+bx+c ecuacion de segundo grado
public class Raices {
	//seccion de atributos
	private double a;
	private double b;
	private double c;
	
	//seccion de metodos
	public Raices() {} //contructor por default
	public Raices(double a,double b, double c) //contructor comun
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	//imprime las 2 posibles soluciones 
	//Fórmula ecuación 2º grado: (-b±√((b^2)-(4ac)))/(2*a)
	//Solo varía el signo delante de -b*/
	
	public void obtenerRaices() 
	{
		double raiz1 = -this.b + (Math.sqrt(Math.pow(b, 2)-4*this.a*this.c))/2*this.a;
		double raiz2 = -this.b - (Math.sqrt(Math.pow(b, 2)-4*this.a*this.c))/2*this.a;
		
		System.out.println("La solucion 1 es : " + raiz1);
		System.out.println("La solucion 2 es : " + raiz2);
	}
	
	public void obtenerRaiz() 
	{
		double raiz = Math.pow(b, 2)-4*this.a*this.c;
		if(raiz == 0) 
		{
			double x =(-b)/(2*a);
			System.out.println("La solucion es : " + x);
		}
		else {
			System.out.println("Error");
		}
		
	}
	public double getDiscriminante() 
	{
		
		double discriminante = Math.pow(b, 2)-4*this.a*this.c;
		return discriminante;
	}
	
}
