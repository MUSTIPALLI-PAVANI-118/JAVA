import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextFieldCheckGUI extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    JLabel resultLabel;
    TextFieldCheckGUI() {
        setTitle("Text Field Check");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField(20);   // user types input here
        button = new JButton("Submit");
        resultLabel = new JLabel("");
        button.addActionListener(this);
        add(new JLabel("Enter text:"));
        add(textField);
        add(button);
        add(resultLabel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();   // taking user input from text field

        if (input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Text field is empty!");
        } else {
            resultLabel.setText("You entered: " + input);
        }
    }
    public static void main(String[] args) {
        new TextFieldCheckGUI();
    }
}
