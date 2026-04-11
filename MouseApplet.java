import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends Applet implements MouseListener {
    String msg = "";

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at (" + e.getX() + "," + e.getY() + ")";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void paint(Graphics g) {
        g.drawString(msg, 20, 50);
    }
}
