package JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class DynamicProgramInsert7 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?)";   //Placeholders

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			 PreparedStatement pstmt = con.prepareStatement(query);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter employee id");
			int empid = scan.nextInt();
			System.out.println("Enter employee name");
			String empname = scan.next();
			System.out.println("Enter employee salary");
			int empsalary = scan.nextInt();
			
			pstmt.setInt(1, empid);
			pstmt.setString(2, empname);;
			pstmt.setInt(3, empsalary);
			
			pstmt.execute();
			System.out.println("Rows are inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
