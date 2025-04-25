package simple_hospital_mgmt;

import java.sql.SQLException;

public class LabTestService {

    // Add a lab test for a patient
    public boolean addLabTest(int patientId, String testName, String testDate, String result, String status) throws SQLException {
        LabTest labTest = new LabTest(patientId, testName, testDate, result, status);
        return LabTestDAO.addLabTest(labTest);
    }

    // Get all lab tests for a specific patient
    public void getLabTestsForPatient(int patientId) throws SQLException {
        LabTestDAO.getLabTestsForPatient(patientId);
    }
}
