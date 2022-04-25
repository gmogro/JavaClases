
public class Persona {
	//Atributos
	private String nombreCompleto;
	private String documento;
	
	public Persona() {
	}

	public Persona(String nombreCompleto, String documento) {
		this.nombreCompleto = nombreCompleto;
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

}
