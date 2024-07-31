package JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class MultipleRowsInsertUsingBatch10 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		
		//Query to be executed
		String query = "INSERT INTO HOSPITAL VALUES(?, ?, ?)";
		
		try 
		{
			//establishing the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of rows to be inserted");
			int rows = sc.nextInt();
			
			for(int i=1 ; i<=rows ; i++)
			{
				System.out.println("Enter P_id for patient " + i);
				int p_id = sc.nextInt();
				System.out.println("Enter P_name for patient " + i);
				String p_name = sc.next();
				System.out.println("Enter P_age for patient " + i);
				int p_age = sc.nextInt();
				
				pstmt.setInt(1, p_id);
				pstmt.setString(2, p_name);
				pstmt.setInt(3, p_age);
				pstmt.addBatch();
			}
			
			pstmt.executeBatch();
			System.out.println("Rows are inserted");
		} 
		catch (Exception e) 
		{
		   e.printStackTrace();	
		}
	}
}
