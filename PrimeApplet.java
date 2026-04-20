import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PrimeApplet extends Applet implements ActionListener {
    TextField t;
    Button b;
    String result = "";

    public void init() {
        t = new TextField(10);
        b = new Button("Check Prime");

        add(t);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(t.getText());
        boolean isPrime = true;

        if (n <= 1) isPrime = false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            result = "Prime Number";
        else
            result = "Not Prime";

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 100);
    }
}
