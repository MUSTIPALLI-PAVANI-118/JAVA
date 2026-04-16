import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EvenOddApplet extends Applet implements ActionListener {
    TextField t;
    Button b;
    String result = "";

    public void init() {
        t = new TextField(10);
        b = new Button("Check");

        add(t);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(t.getText());
        if (num % 2 == 0)
            result = "Even Number";
        else
            result = "Odd Number";

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 100);
    }
}
