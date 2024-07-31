package JDBCProject;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		
//		String query = "CREATE TABLE CUSTOMER ( CUSTID INT ,  CUSTNAME VARCHAR(10))";
		
//		String query = "INSERT INTO CUSTOMER VALUES(1, 'HULK'),(2, 'THOR')";
		
//		String query = "UPDATE CUSTOMER SET CUSTNAME='TONY' WHERE CUSTID=1";
		
		String query = "DELETE FROM CUSTOMER WHERE CUSTID=1";
		
//		String query = "SELECT * FROM CUSTOMER";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded ");
			
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Successfull");
			
			Statement stmt = con.createStatement();
			
//			stmt.execute(query);  // It is only use for creating the table 
//			System.out.println("Query is executed");
			
			stmt.executeUpdate(query); // It is use for updating  & deleting the table
			System.out.println("Query is executed");
			
//			ResultSet rs = stmt.executeQuery(query);
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
//			}
//			System.out.println("Query is executed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
