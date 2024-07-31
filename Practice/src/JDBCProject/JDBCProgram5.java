package JDBCProject;

//1. Import java.sql package
import java.sql.*;

public class JDBCProgram5 {

	public static void main(String[] args) {
		
		// url , username & password for connecting with DB
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		
		// 4. Query to be executed
//		String query = "CREATE TABLE STUDENT (ROLLNO INT, NAME VARCHAR(10))";
		
		// 7. Query to be executed
//		String query = "INSERT INTO STUDENT VALUES(2, 'DIBYA')";
		
		// 8. Query to be executed
//		String query = "UPDATE STUDENT SET NAME='BOB' WHERE ROLLNO=2";
		
		// 10. Query to be executed
		String query = "DELETE FROM STUDENT WHERE ROLLNO=5";
		
		try {
		
			// 2. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			// 3. Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			
			// 5. Creating the statement
			Statement stmt = con.createStatement();
			
			// 6. Executing the query
//			stmt.execute(query);
			
			// 9. Executing the Update query
			stmt.executeUpdate(query);
			System.out.println("Query is Executed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
