/*
 * son: nombre del cliente (String), número de cuenta (String), tipo de interés
(double) y saldo (double).*/
/*
 * Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique.
Esa cantidad no puede ser negativa. Un reintegro consiste en disminuir el saldo en
una cantidad pero antes se debe comprobar que hay saldo suficiente. La cantidad no
puede ser negativa. Los métodos ingreso y reintegro devuelve true si la operación se
ha podido realizar o false en caso contrario. Método de transferencia que permita
pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero
suficiente para poder hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe); que indica que queremos hacer
una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.*/

public class Cuenta {
	//Seccion atributos
	private String nombre;
	private String numeroCuenta;
	private double interes;
	private double saldo;
	//
	//Seccion Metodos
	
	public void transferencia(Cuenta cuentaDestino, double importe) 
	{
		if(ingreso(importe)) 
		{
			cuentaDestino.setSaldo(importe);
		}
	}
	
	public boolean ingreso(double cantidad) 
	{
		//Cuenta cuentaAux = new Cuenta(this);
		double saldoAnterior = this.getSaldo();
		double saldoActual = this.getSaldo() + cantidad;
		if(saldoAnterior == this.getSaldo()) 
		{
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public boolean reintegro(double cantidad) 
	{
		//Cuenta cuentaAux = new Cuenta(this);
		double saldoAnterior = this.getSaldo();
		if(saldoAnterior>cantidad) 
		{
			double saldoActual = this.getSaldo() - cantidad;
			this.setSaldo(saldoActual);
			if(saldoAnterior == this.getSaldo()) 
			{
				return  false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	public Cuenta() {
	}
	
	public Cuenta(String nombre, String numeroCuenta, double interes, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}
	
	public Cuenta(Cuenta cuenta) {
		this.nombre = cuenta.nombre;
		this.numeroCuenta = cuenta.numeroCuenta;
		this.interes = cuenta.interes;
		this.saldo = cuenta.saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
