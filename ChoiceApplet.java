import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ChoiceApplet extends Applet implements ItemListener {
    Choice c;
    String msg = "";

    public void init() {
        c = new Choice();
        c.add("CSE");
        c.add("ECE");
        c.add("EEE");

        add(c);
        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        msg = "Selected: " + c.getSelectedItem();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}
