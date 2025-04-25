package simple_hospital_mgmt;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PatientForm extends JPanel {
    public PatientForm(HospitalManagementSystem parentFrame) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.CYAN),
                "Patient Details", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 16), Color.BLUE));
        setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        String[] labels = {"Patient Name:", "Age:", "Gender:", "Phone:", "Address:"};
        Color labelColor = new Color(0, 102, 204);

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            JLabel label = new JLabel(labels[i]);
            label.setForeground(labelColor);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            add(label, gbc);

            gbc.gridx = 1;
            add(new JTextField(15), gbc);
        }

        JButton registerBtn = new JButton("Register");
        registerBtn.setBackground(new Color(0, 153, 76));
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setFocusPainted(false);
        registerBtn.setFont(new Font("Arial", Font.BOLD, 14));

        gbc.gridx = 1;
        gbc.gridy = labels.length;
        add(registerBtn, gbc);

        registerBtn.addActionListener(e -> {
            parentFrame.switchToLabTestForm();
        });
    }
}
