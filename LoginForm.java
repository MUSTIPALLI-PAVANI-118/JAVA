import javax.swing.*;
import java.awt.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel message = new JLabel("");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(userLabel);
        frame.add(username);

        frame.add(passLabel);
        frame.add(password);

        frame.add(loginButton);
        frame.add(message);

        loginButton.addActionListener(e -> {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                message.setText("Login Successful");
            } else {
                message.setText("Invalid Login");
            }
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
