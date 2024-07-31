package com.app.JDBC;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_connection{

	public static void main(String[] args) {
		
		try {
			// load the Driver :
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a Connection
			/*
			 * String url = "jdbc:mysql://localhost:3306/jdbcconnect"; String username =
			 * "root"; String password = "Shaik@7411";
			 * 
			 * Connection con =
			 *//* DriverManager.getConnection(url, username, password); */

			// Create a Query

			String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(200))";

			// Create a Statement

			Statement stmt = ConnectionClass.getConnection().createStatement();

			// Execute the Query
			stmt.executeUpdate(q);

			System.out.println("Table Created in database");

		

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
