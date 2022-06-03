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
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Conecction");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
			System.out.println("ejecutar sql");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT Name,Code,Population From country";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("Name");
				String code = rs.getString("Code");
				String population = rs.getString("Population");
				System.out.println(code +" : "+ name + " " + population + " Habitantes");
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException se){
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
