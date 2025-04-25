package simple_hospital_mgmt;

import javax.swing.*;

public class HospitalManagementSystem extends JFrame {

    public HospitalManagementSystem() {
        setTitle("Hospital Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Start with PatientForm
        setContentPane(new PatientForm(this));
    }

    // Method to switch to LabTestForm
    public void switchToLabTestForm() {
        setContentPane(new LabTestForm(this));
        revalidate();  // Refresh the frame
        repaint();
    }

    // Method to switch to PaymentForm
    public void switchToPaymentForm() {
        setContentPane(new PaymentForm(this));
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HospitalManagementSystem().setVisible(true);
        });
    }
}
