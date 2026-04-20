import java.applet.Applet;
import java.awt.*;

public class CirclesApplet extends Applet {
    public void paint(Graphics g) {
        int x = 50, y = 50, size = 50;

        for (int i = 0; i < 5; i++) {
            g.drawOval(x, y, size, size);
            x -= 10;
            y -= 10;
            size += 20;
        }
    }
}
