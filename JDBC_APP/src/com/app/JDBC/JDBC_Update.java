package com.app.JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Update {

	public static void main(String[] args) {

		try {
//
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect", "root",
//					"Shaik@7411");

			String q = "update table1 set tName=?, tCity=? where tId=?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter New Name :");
			String name = br.readLine();

			System.out.println("Enter New City :");
			String city = br.readLine();

			System.out.println("Enter the Student Id :");
			int id = Integer.parseInt(br.readLine());

			//PreparedStatement pstmt = con.prepareStatement(q);
			
			PreparedStatement pstmt = ConnectionClass.getConnection().prepareStatement(q);

			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);

			pstmt.executeUpdate();

			System.out.println("Done...");

//			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
