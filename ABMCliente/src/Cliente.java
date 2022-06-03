
public class Cliente {
	private int idcliente; 
	private String nombre;
	private String apellido;
	private String domicilio;
	private String cuit;
	private String telefono;
	
	public Cliente() {
	}
	public Cliente(int idcliente, String nombre, String apellido, String domiciolio, String cuit, String telefono) {

		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domiciolio;
		this.cuit = cuit;
		this.telefono = telefono;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domiciolio) {
		this.domicilio = domiciolio;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
