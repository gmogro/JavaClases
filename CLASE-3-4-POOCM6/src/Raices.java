/*
 * Vamos a realizar una clase llamada Raíces, donde representaremos los valores de
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

//Ecuacion de segundo grado es aX^2+bX+c
public class Raices {
	
	//seccion de atributos
	private double a;
	private double b;
	private double c;
	
	//Contructores
	public Raices() {}//default
	
	public Raices(double a,double b,double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//geters y seters
	public double getA() 
	{
		return this.a;
	}
	
	public void setA(double a) 
	{
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
	
	//Fórmula ecuación 2º grado: (-b±√((b^2)-(4ac)))/(2*a)
	public void obtenerRaices() 
	{
		if(this.getdiscriminante()>0){
			double raiz = -this.getB()+Math.sqrt(Math.pow(this.getB(),2)-4*this.getA()*this.getC())/2*this.getA();
			double raiz2 = -this.getB()-Math.sqrt(Math.pow(this.getB(),2)-4*this.getA()*this.getC())/2*this.getA();
			
			System.out.println("LA Raiz 1 : "+ raiz);
			System.out.println("LA Raiz 2 : "+ raiz2);
		}else {
			if(this.getdiscriminante()== 0) 
			{
				double raiz3 = (-this.getB())/(2*this.getA());
				System.out.println("La raiz es "+ raiz3);
			}
			else {
				if(this.getdiscriminante()<0) 
				{
					System.out.println("Numero complejo");
				}
			}
		}
	}
	
	
	public double getdiscriminante() 
	{
		return Math.pow(this.getB(),2)-4*this.getA()*this.getC();//(b^2)-(4ac)
	}
	
	
	
	
	
	
	
	
	
	
	
}
