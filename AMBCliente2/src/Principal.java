import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConexionBD cnn = new ConexionBD();
		
		cnn.getConnection();
		
		/*Cliente cliente = new Cliente(1,"Gillermo","Mogro","domicilio","12421","12515532");
		try {
			cnn.insertCliente(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//cnn.updateCliente("Guillermo",1);
		
		//cnn.deleteCliente(1);
		
		/*Cliente cliente = cnn.selectCliente(1);
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getApellido());
		System.out.println(cliente.getDomicilio());
		System.out.println(cliente.getTelefono());
		System.out.println(cliente.getCuit());*/
		
		cnn.selectAllCliente();
		
	}

}
