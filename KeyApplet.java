import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class KeyApplet extends Applet implements KeyListener {
    String msg = "";

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        msg = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
