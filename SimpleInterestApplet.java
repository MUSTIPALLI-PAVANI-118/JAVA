import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestApplet extends Applet implements ActionListener {
    TextField p, r, t;
    Button b;
    String result = "";

    public void init() {
        p = new TextField(5);
        r = new TextField(5);
        t = new TextField(5);
        b = new Button("Calculate");

        add(new Label("P:"));
        add(p);
        add(new Label("R:"));
        add(r);
        add(new Label("T:"));
        add(t);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        double pr = Double.parseDouble(p.getText());
        double ra = Double.parseDouble(r.getText());
        double ti = Double.parseDouble(t.getText());

        double si = (pr * ra * ti) / 100;
        result = "Simple Interest = " + si;

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(result, 50, 100);
    }
}
