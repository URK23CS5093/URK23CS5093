package simple_hospital_mgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver (optional step for newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/simple_hospital_system", // Database URL
                "root",  // MySQL username (default is 'root')
                "ROOT" // MySQL password (leave empty if none)
            );
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return null;
    }
}
