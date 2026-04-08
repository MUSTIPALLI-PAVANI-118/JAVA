import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input fields
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);

        // Operations
        String operations[] = {"+", "-", "*", "/"};
        JComboBox<String> operator = new JComboBox<>(operations);

        // Button
        JButton calculate = new JButton("Calculate");

        // Result label
        JLabel result = new JLabel("Result: ");

        // Add components
        frame.add(new JLabel("Number 1:"));
        frame.add(num1);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2);
        frame.add(operator);
        frame.add(calculate);
        frame.add(result);

        // Event Handling
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    String op = (String) operator.getSelectedItem();
                    double res = 0;

                    switch (op) {
                        case "+": res = n1 + n2; break;
                        case "-": res = n1 - n2; break;
                        case "*": res = n1 * n2; break;
                        case "/":
                            if (n2 == 0) {
                                result.setText("Error: Divide by zero!");
                                return;
                            }
                            res = n1 / n2;
                            break;
                    }

                    result.setText("Result: " + res);

                } catch (Exception ex) {
                    result.setText("Error: Invalid input!");
                }
            }
        });

        frame.setVisible(true);
    }
}