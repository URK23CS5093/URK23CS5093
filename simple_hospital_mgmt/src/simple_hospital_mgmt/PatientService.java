package simple_hospital_mgmt;

import java.sql.SQLException;

public class PatientService {

    // Add a patient
    public boolean addPatient(String name, int age, String gender) throws SQLException {
        Patient patient = new Patient(name, age, gender);
        return PatientDAO.addPatient(patient);
    }

    // Get all patients
    public void getAllPatients() throws SQLException {
        PatientDAO.getAllPatients();
    }
}

