package simple_hospital_mgmt;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class LabTestForm extends JPanel {

    public LabTestForm(HospitalManagementSystem parentFrame) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.MAGENTA), 
                "Lab Test Entry", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 16), Color.MAGENTA));
        setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        String[] labels = {"Test Name:", "Patient ID:", "Date:", "Doctor Name:", "Result:"};
        Color labelColor = new Color(102, 0, 153);

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            JLabel label = new JLabel(labels[i]);
            label.setForeground(labelColor);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            add(label, gbc);

            gbc.gridx = 1;
            JTextField textField = new JTextField(20);
            textField.setFont(new Font("Arial", Font.PLAIN, 14));
            textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            add(textField, gbc);
        }

        JButton saveBtn = new JButton("Save Test");
        saveBtn.setBackground(new Color(153, 51, 255));
        saveBtn.setForeground(Color.WHITE);
        saveBtn.setFont(new Font("Arial", Font.BOLD, 14));
        saveBtn.setFocusPainted(false);

        gbc.gridx = 1;
        gbc.gridy = labels.length;
        add(saveBtn, gbc);

        saveBtn.addActionListener(e -> {
            parentFrame.switchToPaymentForm();
        });
    }
}
