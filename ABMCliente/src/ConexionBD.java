import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/abmcliiente";
	private static final String USER = "root";
	private static final String PASS = "Navidad$25";
	
	public ConexionBD() {}
	
	public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
	
	public void insertCliente(Cliente cliente) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement stmt = null;
        try {
        	stmt = connection.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?,?)");
        	stmt.setInt(1,cliente.getIdcliente());
        	stmt.setString(2,cliente.getNombre());
        	stmt.setString(3,cliente.getApellido());
        	stmt.setString(4,cliente.getDomicilio());
        	stmt.setString(5,cliente.getTelefono());
        	stmt.setString(6,cliente.getCuit());
        	int response = stmt.executeUpdate();
        	if (response > 0)
                System.out.println("Insertado correctamente");
        	
        }catch (SQLException sqle){
            System.out.println("SQLState: "+ sqle.getSQLState());
            System.out.println("SQLErrorCode: " + sqle.getErrorCode());
            sqle.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection != null) {
              try{
	               stmt.close();
	               connection.close();
              }catch(Exception e){
                   e.printStackTrace();
              }
            }
        } 
    }
	
	public Cliente selectCliente(int id) {
        Cliente cliente = null;
        Connection connection = getConnection();
        Statement stmt = null;
        try{
			stmt = connection.createStatement();
			String sql;
			sql = "SELECT idcliente,Nombre,Apellido,Domicilio,Telefono,Cuit FROM cliente WHERE idcliente = " + id;
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) 
			{
				//int idDB = rs.getInt("id");
				String nombreDB = rs.getString("Nombre");
				String apellido = rs.getString("Apellido");
                String domicilio = rs.getString("Domicilio");
                String telefono = rs.getString("Telefono");
                String cuit = rs.getString("Cuit");
                cliente = new Cliente(id, nombreDB, apellido, domicilio,telefono,cuit);
			}
			rs.close();
			stmt.close();
			connection.close();
        } catch (SQLException se) {
        	se.printStackTrace();
        }
        return cliente;
    }
	
	public void updateCliente(String nombre, int id) 
	{
		Connection connection = getConnection();
		PreparedStatement stmt = null;
        try{
        	stmt = connection.prepareStatement("UPDATE cliente SET Nombre=? WHERE idcliente=?");
        	stmt.setString(1,nombre);
        	stmt.setString(2,id+"");
        	int response = stmt.executeUpdate();
        	if (response > 0)
                System.out.println("Insertado correctamente");
        }catch (SQLException se) {
        	se.printStackTrace();
        }
	}
	
	public void deleteCliente(int id) 
	{
		Connection connection = getConnection();
		PreparedStatement stmt = null;
        try{
        	stmt = connection.prepareStatement("DELETE FROM cliente WHERE idcliente=?");
        	stmt.setString(1,id+"");
        	int response = stmt.executeUpdate();
        	if (response > 0)
                System.out.println("Eliminado correctamente");
        }catch (SQLException se) {
        	se.printStackTrace();
        }
	}
}
