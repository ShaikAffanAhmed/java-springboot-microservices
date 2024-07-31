package JDBCProject;

import java.sql.*;
import java.util.Scanner;

public class DynamicProgramUpdate8 {

    public static void main(String[] args) {
    
        String url = "jdbc:mysql://localhost:3306/myjdbcdb";
        String username = "root";
        String password = "Shaik@7411";
        
        String selectQuery = "SELECT * FROM EMPLOYEE";
        String updateQuery = "UPDATE EMPLOYEE SET EMPNAME=? WHERE EMPID=?";
        
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery)) {
            
            System.out.println("Connection is established");
            
            // Display current data before update
            while (rs.next()) {
                int empid = rs.getInt("EMPID");
                String empname = rs.getString("EMPNAME");
                int empsalary = rs.getInt("EMPSALARY");
                
                System.out.print("ID: " + empid);
                System.out.print(", Name: " + empname);
                System.out.println(", Salary: " + empsalary);
            }
            
            // Prompt user for new name and employee ID
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a New Name to be Updated:");
            String newEmpName = scan.nextLine(); // Use nextLine() to capture full name
            System.out.println("Enter the ID where name has to be updated:");
            int empidToUpdate = scan.nextInt();
            
            // Prepare update statement
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, newEmpName); // Set EMPNAME parameter
            pstmt.setInt(2, empidToUpdate); // Set EMPID parameter
            
            // Execute update
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Successfully Updated " + rowsUpdated + " rows.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
