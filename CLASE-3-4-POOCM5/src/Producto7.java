/*Crear una Clase Producto que contenga los siguientes atributos: id, nombre,
categor�a, precio, stock.Crear un objeto Producto utilizando un constructor a su
elecci�n. Dentro de la clase crear los siguientes m�todos:
 Crear un metodo validarStock este m�todo debe devolver un true si es que
tiene stock disponible, sino lo tienen debe devolver false.
 Crear un metodo vender este m�todo debe recibir una categor�a y la unidades
que se desean vender, el m�todo debe validar usando el m�todo anterior si
hay stock antes de realizar la venta, si se puede vender debemos comprobar
que la categor�a ingresada sea igual a la del producto si es asi recien se
puede realizar la venta por lo cual debe mostrar el total a pagar por la venta y
actualizar el stock del producto, en cualquiera de los otros casos que no se
pueda vender mostrar un mensaje de error a su elecci�n.
 Crear un m�todo comprar este m�todo debe recibir como par�metro las
cantidad de producto y la categor�a, si la categor�a coincide con la del
producto actual y el stock est� por debajo de 100 unidades esa cantidad de
producto debe ser sumada al stock actual, mostrar un mensaje con todos los
datos del objeto. En caso contrario mostrar un mensaje �no se pudo agregar
la compra�. Los m�todos deben ser probados en el objeto creado ingresando
valores a su elecci�n y mostrando los resultados. Cuando quiera probar el
m�todo validar en la consola debe mostrar en vez de true �si tiene stock�, y en
vez de false �no tiene stock�.*/
public class Producto7 {
	
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto7(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/*crear un metodo validarStock este m�todo debe devolver un true si es que
	tiene stock disponible, sino lo tienen debe devolver false.*/
	public boolean validarStock() 
	{
		if(this.getStock()>0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/*Crear un metodo vender este m�todo debe recibir una categor�a y la unidades
	que se desean vender, el m�todo debe validar usando el m�todo anterior si
	hay stock antes de realizar la venta, si se puede vender debemos comprobar
	que la categor�a ingresada sea igual a la del producto si es asi recien se
	puede realizar la venta por lo cual debe mostrar el total a pagar por la venta y
	actualizar el stock del producto, en cualquiera de los otros casos que no se
	pueda vender mostrar un mensaje de error a su elecci�n.*/
	
	public void vender(String categoria,int cantidad) {
		if(this.validarStock()) 
		{
			if(this.getCategoria().equals(categoria)) 
			{
				System.out.println("total a pagar"+ this.precio*cantidad);
				this.setStock(this.getStock() - cantidad);//actualizo stock
			}
			else 
			{
				System.out.println("Categoria no es igual a la categoria de la clase");
				System.out.println(this.getCategoria()+ " distinto " + categoria);
			}
		}
		else {
			System.out.println("No hay stock");
		}
	}
	
	/*
	 * Crear un m�todo comprar este m�todo debe recibir como par�metro las
		cantidad de producto y la categor�a, si la categor�a coincide con la del
		producto actual y el stock est� por debajo de 100 unidades esa cantidad de
		producto debe ser sumada al stock actual, mostrar un mensaje con todos los
		datos del objeto. En caso contrario mostrar un mensaje �no se pudo agregar
		la compra�. Los m�todos deben ser probados en el objeto creado ingresando
		valores a su elecci�n y mostrando los resultados. Cuando quiera probar el
		m�todo validar en la consola debe mostrar en vez de true �si tiene stock�, y en
		vez de false �no tiene stock�*/
	
	public void comprar(String categoria, int cantidad) 
	{
		if(this.getCategoria().equals(categoria) && this.getStock()<100) 
		{
			this.setStock(this.getStock() + cantidad);
			System.out.println("Nombre"+this.getNombre());
			System.out.println("Nombre"+this.getCategoria());
			System.out.println("Nombre"+this.getStock());
			System.out.println("Nombre"+this.getPrecio());
		}
		else {
			System.out.println("No se puede comprar");
		}
	}
	
	
	
	
	
	
	
	
	/*
	 * @Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Nombre"+this.getNombre());
		System.out.println("Nombre"+this.getCategoria());
		System.out.println("Nombre"+this.getStock());
		System.out.println("Nombre"+this.getPrecio());
		return super.toString();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
