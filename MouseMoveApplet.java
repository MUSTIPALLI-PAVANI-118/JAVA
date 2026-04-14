import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseMoveApplet extends Applet implements MouseMotionListener {
    int x = 0, y = 0;

    public void init() {
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent e) {}

    public void paint(Graphics g) {
        g.drawString("X = " + x + " Y = " + y, 50, 50);
    }
}
