import java.sql.SQLException;

public class Principal {
	public static void main(String[] args) {
		
		ConexionBD cnn = new ConexionBD();
		
		cnn.getConnection();
		
		/*Cliente cliente = new Cliente(1,"Guillermo","Mogro","Domicilio","1111","124124");
		try {
			cnn.insertCliente(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//cnn.updateCliente("Cristian",1);
		
		//cnn.deleteCliente(1);
		
		Cliente cliente = cnn.selectCliente(1);
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getApellido());
		System.out.println(cliente.getDomicilio());
		System.out.println(cliente.getTelefono());
		System.out.println(cliente.getCuit());
		
		cnn.selectAllCliente();
	}
}









