package JDBCProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AllCRUDOperationUserInput9 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		
		try
		{	
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Conncetion is established");
			
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1: insert(con);
			break;
			case 2: update(con);
			break;
			case 3: delete(con);
			break;
			case 4: fetchData(con);
			break;
			}
		} 
		catch (Exception e) {
				e.printStackTrace();
		}
	}
	
		static void insert(Connection con) throws Exception 
		{
			String query = "INSERT INTO EMPLOYEE VALUES( ? , ? , ? )";
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter employee id");
			int empid = sc.nextInt();
			System.out.println("Enter employee name");
			String empname = sc.next();
			System.out.println("Enter employee salary");
			int empsalary = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1 , empid);
			pstmt.setString(2 , empname);
			pstmt.setInt(3 , empsalary);
			
			pstmt.execute();
			System.out.println("Rows are inserted");
			fetchData(con);
	}

		static void update(Connection con) throws Exception 
		{
			String query = "UPDATE EMPLOYEE SET EMPNAME=? WHERE EMPID=?";
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter employee name");
			String empname = sc.next();
			System.out.println("Enter employee id");
			int empid = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1 , empname);
			pstmt.setInt(2, empid);
			
			pstmt.executeUpdate();
			System.out.println("Rows are updated");
			fetchData(con);
		}
		
		static void delete(Connection con) throws Exception 
		{
			String query = "DELETE FROM EMPLOYEE WHERE EMPID=?";
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter employee id");
			int empid = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, empid);
			
			pstmt.executeUpdate();
			System.out.println("Rows are deleted");
			fetchData(con);
		}
		
		static void fetchData(Connection con) throws Exception 
		{
			String query = "SELECT * FROM EMPLOYEE WHERE EMPID=?";
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter employee id");
			int empid = sc.nextInt();
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, empid);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3) );
			}
		}
}
