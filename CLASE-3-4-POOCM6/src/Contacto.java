
public class Contacto {
	//atributos
	private String nombre;
	private String telefono;
	
	//contructores
	public Contacto(){}
	
	public Contacto(String nombre, String telefono) 
	{
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public String getNombre() 
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getTelefono() 
	{
		return this.telefono;
	}
	
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}
	public boolean comparaNombre(Contacto contacto) 
	{
		//this.getNombre().trim()
		if(this.getNombre().equals(contacto.getNombre())) 
		{
			return true;
		}
		return false;
	}

}
