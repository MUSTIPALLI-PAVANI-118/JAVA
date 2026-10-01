import javax.swing.*;

public class HelloJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello JFrame");

        JLabel label = new JLabel("Welcome to Java JFrame", SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
