import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {
    TextField t;
    Button b;
    String result = "";

    public void init() {
        t = new TextField(10);
        b = new Button("Find Factorial");

        add(t);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(t.getText());
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        result = "Factorial: " + fact;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 100);
    }
}
