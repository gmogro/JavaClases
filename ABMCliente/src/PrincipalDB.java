import java.sql.SQLException;

public class PrincipalDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionBD cnn = new ConexionBD();
		
		cnn.getConnection();
		
		/*try {
			Cliente cliente = new Cliente(1, "Guillermo","Mogro","Domicilio","11111","12354");
			cnn.insertCliente(cliente);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Cliente cliente1 = cnn.selectCliente(1);
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getApellido());
		System.out.println(cliente1.getDomicilio());
		System.out.println(cliente1.getTelefono());
		System.out.println(cliente1.getCuit());*/
		
		/*cnn.updateCliente("Cristian", 1);
		Cliente cliente1 = cnn.selectCliente(1);
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getApellido());
		System.out.println(cliente1.getDomicilio());
		System.out.println(cliente1.getTelefono());
		System.out.println(cliente1.getCuit());*/
		
		cnn.deleteCliente(1);
	}

}
