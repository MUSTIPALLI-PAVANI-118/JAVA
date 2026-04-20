import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class LargestApplet extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Button b;
    String result = "";

    public void init() {
        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);
        b = new Button("Find Largest");

        add(t1);
        add(t2);
        add(t3);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b1 = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());

        int max = a;
        if (b1 > max) max = b1;
        if (c > max) max = c;

        result = "Largest: " + max;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 100);
    }
}
