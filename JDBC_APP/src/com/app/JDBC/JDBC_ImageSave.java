package com.app.JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_ImageSave {

	public static void main(String[] args) throws SQLException, IOException {

//			String url = "jdbc:mysql://localhost:3306/jdbcconnect";
//			String username = "root";
//			String password = "Shaik@7411";

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcconnect", "root", "Shaik@7411");

		String q = "insert into images(pic) values(?)";

		PreparedStatement pstmt = con.prepareStatement(q);

//			pstmt.setString(1, "value");

		try {
			FileInputStream fis = new FileInputStream("C:/Users/shaik/OneDrive/Desktop/New folder/mypic.jpg.jpg");
			pstmt.setBinaryStream(1, fis, fis.available());

			pstmt.executeUpdate();

			System.out.println("Image Inserted...");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
