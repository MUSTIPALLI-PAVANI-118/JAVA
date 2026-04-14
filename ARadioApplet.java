import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RadioApplet extends Applet implements ItemListener {
    Checkbox c1, c2;
    CheckboxGroup cg;
    String msg = "";

    public void init() {
        cg = new CheckboxGroup();
        c1 = new Checkbox("Option 1", cg, false);
        c2 = new Checkbox("Option 2", cg, false);

        add(c1);
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        msg = "Selected: " + cg.getSelectedCheckbox().getLabel();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}
