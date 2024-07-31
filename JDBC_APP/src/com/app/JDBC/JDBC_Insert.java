package com.app.JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Insert {

	public static void main(String[] args) {

		try {

//		    Class.forName("com.mysql.jdbc.Driver");

			// Creating a Connection
//
//			String url = "jdbc:mysql://localhost:3306/jdbcconnect";
//			String username = "root";
//			String password = "Shaik@7411";
//
//			Connection con = DriverManager.getConnection(url, username, password);

			// Create a Query
			String q = "insert into table1(tName,tCity) values(?,?)";

			// get the PreparedStatement Object

//			PreparedStatement pstmt = con.prepareStatement(q);
			PreparedStatement pstmt = ConnectionClass.getConnection().prepareStatement(q);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name :");
			String name = br.readLine();

			System.out.println("Enter City :");
			String city = br.readLine();

			// set the values to Query

			pstmt.setString(1, name);
			pstmt.setString(2, city);

			pstmt.executeUpdate();

			System.out.println("Data Inserted Successfylly...");

			//con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
