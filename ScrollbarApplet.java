import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ScrollbarApplet extends Applet implements AdjustmentListener {
    Scrollbar s;
    int val;

    public void init() {
        s = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
        add(s);
        s.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        val = s.getValue();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Value: " + val, 50, 100);
    }
}
