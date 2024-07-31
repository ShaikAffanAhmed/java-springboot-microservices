package JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class JDBCTransactionExample11 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		Connection con = null;
		String query1 = "UPDATE BANK SET BALANCE=BALANCE-? WHERE ACCOUNT_NO=1111";
		String query2 = "UPDATE BANK SET BALANCE=BALANCE+? WHERE ACCOUNT_NO=3333";

		try 
		{
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connectin Established");

			//1. setting the auto commit status as false
			con.setAutoCommit(false);
			
			PreparedStatement pstmt1 = con.prepareStatement(query1);
			PreparedStatement pstmt2 = con.prepareStatement(query2);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to be transfered");
			int amount = sc.nextInt();

			pstmt1.setInt(1, amount);
			pstmt2.setInt(1, amount);

			pstmt1.executeUpdate();
			System.out.println("Amount is debited from acc_no : 1111");
			pstmt2.executeUpdate();
			System.out.println("Amount is credited to acc_no : 3333");
			
			//2. Committing the changes
			con.commit();
			
		} catch (Exception e) {
			try {
				// 3. If any problem occurs, rollback the changes
				con.rollback();
				System.out.println("Changes are rolled back");
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
