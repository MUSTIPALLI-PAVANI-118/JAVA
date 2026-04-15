import java.applet.Applet;
import java.awt.*;

public class BarGraphApplet extends Applet {
    int values[] = {100, 150, 80, 200};

    public void paint(Graphics g) {
        int x = 50;
        for (int i = 0; i < values.length; i++) {
            g.fillRect(x, 300 - values[i], 40, values[i]);
            x += 60;
        }
    }
}
