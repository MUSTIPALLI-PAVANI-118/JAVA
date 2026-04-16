import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ClickCountApplet extends Applet implements MouseListener {
    int count = 0;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Clicks: " + count, 50, 50);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
