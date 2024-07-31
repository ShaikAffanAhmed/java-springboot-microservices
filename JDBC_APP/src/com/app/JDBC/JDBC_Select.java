package com.app.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {

		try {

//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect", "root",
//					"Shaik@7411");

			String q = "Select * from table1";

//			Statement stmt = con.createStatement();
			Statement stmt = ConnectionClass.getConnection().createStatement();
			ResultSet set = stmt.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);

				System.out.println("Id: " + id + ", Name: " + name + ", City: " + city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
