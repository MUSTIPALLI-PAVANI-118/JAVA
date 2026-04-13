import java.applet.Applet;
import java.awt.*;

public class SmileyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawOval(50, 50, 150, 150); // face
        g.fillOval(90, 90, 20, 20);   // left eye
        g.fillOval(140, 90, 20, 20);  // right eye
        g.drawArc(90, 120, 70, 40, 0, -180); // smile
    }
}
