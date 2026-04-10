import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 50);
        g.drawOval(150, 20, 100, 50);
        g.drawLine(20, 100, 200, 100);
    }
}
