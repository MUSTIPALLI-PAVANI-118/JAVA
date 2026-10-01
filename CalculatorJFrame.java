import javax.swing.*;
import java.awt.*;

public class CalculatorJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel result = new JLabel("Result: ");

        frame.setLayout(new GridLayout(4, 1));

        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(result);

        addButton.addActionListener(e -> {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            result.setText("Result: " + (a + b));
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
