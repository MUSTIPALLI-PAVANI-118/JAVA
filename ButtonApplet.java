import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ButtonApplet extends Applet implements ActionListener {
    Button b;
    String msg = "";

    public void init() {
        b = new Button("Click Me");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Button Clicked!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 80);
    }
}
