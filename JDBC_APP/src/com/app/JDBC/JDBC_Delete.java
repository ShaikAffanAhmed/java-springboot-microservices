package com.app.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {

		try {

//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect", "root",
//					"Shaik@7411");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			int id = sc.nextInt();
			System.out.println("Deleted id :" + id + " Successfully ");

			String q = "delete from table1 where tId = ? ";

//			PreparedStatement pstm = con.prepareStatement(q);
			PreparedStatement pstm = ConnectionClass.getConnection().prepareStatement(q);
			pstm.setInt(1, id);
			pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}