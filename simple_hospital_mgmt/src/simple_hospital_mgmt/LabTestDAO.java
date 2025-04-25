package simple_hospital_mgmt;

import java.sql.*;

public class LabTestDAO {

    // Method to add a lab test for a patient
    public static boolean addLabTest(LabTest labTest) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) {
            System.out.println("Database connection failed!");
            return false;
        }

        String query = "INSERT INTO lab_tests (patient_id, test_name, test_date, result, status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, labTest.getPatientId());
            stmt.setString(2, labTest.getTestName());
            stmt.setString(3, labTest.getTestDate());
            stmt.setString(4, labTest.getResult());
            stmt.setString(5, labTest.getStatus());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    // Method to get all lab tests for a patient
    public static void getLabTestsForPatient(int patientId) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null) {
            System.out.println("Database connection failed!");
            return;
        }

        String query = "SELECT * FROM lab_tests WHERE patient_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, patientId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Test ID: " + rs.getInt("id"));
                System.out.println("Test Name: " + rs.getString("test_name"));
                System.out.println("Test Date: " + rs.getString("test_date"));
                System.out.println("Result: " + rs.getString("result"));
                System.out.println("Status: " + rs.getString("status"));
                System.out.println("------");
            }
        }
    }
}
