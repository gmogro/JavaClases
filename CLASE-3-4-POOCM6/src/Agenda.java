
public class Agenda {
	
	private Contacto[] agenda;
	
	public Agenda() 
	{
		this.agenda = new Contacto[10];
	}
	
	public Agenda(int tamanio) 
	{
		this.agenda = new Contacto[tamanio];
	}

	public Contacto[] getAgenda() {
		return agenda;
	}

	public void setAgenda(Contacto[] agenda) {
		this.agenda = agenda;
	}
	
	public void aniadirContacto(Contacto contacto) 
	{
		if(this.contactosLibres() == this.agenda.length) 
		{
			this.agenda[0] = contacto;
		}
		else {
			if(existeContacto(contacto) == -1) 
			{
				System.out.println("EL CONTACTO SE ENCUENTRA EN LA AGENDA");
			}else if(this.agendaLlena()) 
				  {
					System.out.println("Agenda llena");
				  }
				else 
				{
					for(int i=0; i<this.agenda.length;i++) 
					{
						if(this.agenda[i] == null){
							this.agenda[i] = contacto;
							break;
						}
					}
				}
		}
			
		
	}

	public int existeContacto(Contacto c) 
	{
		int posicion = -1;
		for(int i = 0; i < this.agenda.length; i++){//recorremos todo el array
		  if(this.agenda[i].comparaNombre(c)){//comparamos el elemento en el arreglo con el buscado
			posicion = i;//Si es verdadero guardamos la posicion
			break;//Para el ciclo
		   }
		 }
		return posicion;
	}
	
	public boolean agendaLlena() 
	{
		for(int i = 0; i < this.agenda.length; i++){
		  if(this.agenda[i] == null){
			return false;
		   }
		 }
		return true;
	}
	
	private void mostrarUno(Contacto contacto) 
	{
		System.out.println("Nombre: "+ contacto.getNombre());
		System.out.println("Telefono: "+ contacto.getTelefono());
	}
	
	
	public void listarContactos() 
	{
		for(int i = 0; i < this.agenda.length; i++){
			if(this.agenda[i] != null) 
			{
				this.mostrarUno(this.agenda[i]);
			}
		}
	}
	
	public void buscaContacto(String nombre) 
	{
		int posicion = -1;
		for(int i = 0; i < this.agenda.length; i++){
		  if(this.agenda[i].getNombre().equals(nombre)){
			posicion = i;
			break;
		   }
		 }
		if(posicion != -1) 
		{
			this.mostrarUno(this.agenda[posicion]);
		}else 
		{
			System.out.println("No se encuentra el contacto");
		}
	}
	
	
	public void eliminiarContacto(String nombre) 
	{
		int posicion = -1;
		for(int i = 0; i < this.agenda.length; i++){
		  if(this.agenda[i].getNombre().equals(nombre)){
			posicion = i;
			break;
		   }
		}
		if(posicion != -1) 
		{
			this.agenda[posicion] = null;
		}else 
		{
			System.out.println("No se encuentra el contacto");
		}
	}
	
	public int contactosLibres() 
	{
		int contador = 0;
		for(int i = 0; i < this.agenda.length; i++){
		  if(this.agenda[i] == null){
			contador = contador + 1;
		   }
		 }
		return contador;
	}
}
