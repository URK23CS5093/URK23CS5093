package simple_hospital_mgmt;

import java.sql.*;

public class PatientDAO {

    // Method to add a new patient to the database
    public static boolean addPatient(Patient patient) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) {
            System.out.println("Database connection failed!");
            return false;
        }

        String query = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, patient.getName());
            stmt.setInt(2, patient.getAge());
            stmt.setString(3, patient.getGender());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    // Method to get all patients from the database
    public static void getAllPatients() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) {
            System.out.println("Database connection failed!");
            return;
        }

        String query = "SELECT * FROM patients";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("------");
            }
        }
    }
}


