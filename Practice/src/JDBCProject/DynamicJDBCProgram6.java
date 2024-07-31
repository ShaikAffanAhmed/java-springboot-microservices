package JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class DynamicJDBCProgram6 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "Shaik@7411";
		Connection con = null;
		Statement stmt = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connectin Established");
			stmt = con.createStatement();
			System.out.println("Statement is ready");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Insert(stmt);
				break;
			case 2:
				Update(stmt);
				break;
			case 3:
				Delete(stmt);
				break;
			case 4:
				FetchData(stmt);
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void Insert(Statement stmt) throws SQLException {
		String query = "INSERT INTO EMPLOYEE VALUES(1, 'DIBYA', 3500000),(2, 'CHARTY', 450000)";
		stmt.execute(query);
		System.out.println("Rows are inserted");
		FetchData(stmt);
	}

	static void Update(Statement stmt) throws SQLException {
		String query = "UPDATE EMPLOYEE SET EMPNAME='BOB' WHERE EMPID=2";
		stmt.executeUpdate(query);
		System.out.println("Rows are updated");
		FetchData(stmt);
	}

	static void Delete(Statement stmt) throws SQLException {
		String query = "DELETE FROM EMPLOYEE WHERE EMPID=1";
		stmt.executeUpdate(query);
		System.out.println("Rows are deleted");
		FetchData(stmt);
	}

	static void FetchData(Statement stmt) throws SQLException {
		String query = "SELECT * FROM EMPLOYEE";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
		System.out.println("Data fetched successfully");
	}
}