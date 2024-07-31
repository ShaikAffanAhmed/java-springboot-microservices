package JDBCProject;

// 1. Import java.sql package
import java.sql.*;

public class JDBCProgram1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		
		try {
		
			// 2. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			// 3. Establish the Connection
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}