import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CheckboxApplet extends Applet implements ItemListener {
    Checkbox male, female;
    String msg = "";

    public void init() {
        male = new Checkbox("Male");
        female = new Checkbox("Female");

        add(male);
        add(female);

        male.addItemListener(this);
        female.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (male.getState())
            msg = "Male Selected";
        else if (female.getState())
            msg = "Female Selected";

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}
