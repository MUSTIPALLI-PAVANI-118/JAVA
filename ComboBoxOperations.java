import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxOperations {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ComboBox Operations");
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input field
        JTextField textField = new JTextField(15);

        // ComboBox options
        String options[] = {"UPPERCASE", "lowercase", "Length"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Button
        JButton button = new JButton("Apply");

        // Result label
        JLabel result = new JLabel("Result: ");

        // Add components
        frame.add(new JLabel("Enter Text:"));
        frame.add(textField);
        frame.add(comboBox);
        frame.add(button);
        frame.add(result);

        // Event handling
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String input = textField.getText();
                String selected = (String) comboBox.getSelectedItem();

                if (input.trim().isEmpty()) {
                    result.setText("Error: Enter some text!");
                    return;
                }

                switch (selected) {
                    case "UPPERCASE":
                        result.setText("Result: " + input.toUpperCase());
                        break;

                    case "lowercase":
                        result.setText("Result: " + input.toLowerCase());
                        break;

                    case "Length":
                        result.setText("Length: " + input.length());
                        break;
                }
            }
        });

        frame.setVisible(true);
    }
}