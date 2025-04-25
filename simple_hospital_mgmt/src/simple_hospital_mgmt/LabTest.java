package simple_hospital_mgmt;

public class LabTest {
    private int id;
    private int patientId;
    private String testName;
    private String testDate;
    private String result;
    private String status;

    // Constructor
    public LabTest(int patientId, String testName, String testDate, String result, String status) {
        this.patientId = patientId;
        this.testName = testName;
        this.testDate = testDate;
        this.result = result;
        this.status = status;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
