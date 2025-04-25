package simple_hospital_mgmt;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class PaymentForm extends JPanel {

    public PaymentForm(HospitalManagementSystem parentFrame) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY),
                "Payment Information", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.BOLD, 16), Color.DARK_GRAY));
        setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        String[] labels = {"Patient ID:", "Test ID:", "Amount:", "Payment Method:"};
        Color labelColor = new Color(0, 102, 102);

        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            JLabel label = new JLabel(labels[i]);
            label.setForeground(labelColor);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            add(label, gbc);

            gbc.gridx = 1;
            JTextField textField = new JTextField(15);
            textField.setFont(new Font("Arial", Font.PLAIN, 14));
            textField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            add(textField, gbc);
        }

        JButton payBtn = new JButton("Pay Now");
        payBtn.setBackground(new Color(0, 153, 153));
        payBtn.setForeground(Color.WHITE);
        payBtn.setFont(new Font("Arial", Font.BOLD, 14));
        payBtn.setFocusPainted(false);

        gbc.gridx = 1;
        gbc.gridy = labels.length;
        add(payBtn, gbc);

        payBtn.addActionListener(e -> {
            // Payment processing logic can be added here
            JOptionPane.showMessageDialog(parentFrame, "Payment processed successfully!");
        });
    }
}
