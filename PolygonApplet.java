import java.applet.Applet;
import java.awt.*;

public class PolygonApplet extends Applet {
    public void paint(Graphics g) {
        int x[] = {50, 100, 150, 100};
        int y[] = {100, 50, 100, 150};

        g.drawPolygon(x, y, 4);
    }
}
