import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	static final String USER = "root";
	static final String PASS = "Navidad$25";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("CONECTANDO");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			String sql;
			sql = "SELECT Name,Code,Population FROM country WHERE Name = 'ArgentinA'";
			
			ResultSet rs = stmt.executeQuery(sql);
		
			while(rs.next()) 
			{
				String nombre = rs.getString("Name");
				String code = rs.getString("Code");
				String population = rs.getString("Population");
				System.out.println(code + " : " + nombre + " " + population + " Habitantes");
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}
		catch (SQLException se) {
			//resolver errores de JDBC
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*try {
			if(stmt!=null)
				stmt.close();
		} catch (SQLException se) {
			//resolver errores de JDBC
			se.printStackTrace();
		}*/
		
	}

}
