import java.applet.Applet;
import java.awt.*;

public class TableApplet extends Applet {
    int n = 5;

    public void paint(Graphics g) {
        int y = 30;
        for (int i = 1; i <= 10; i++) {
            g.drawString(n + " x " + i + " = " + (n * i), 50, y);
            y += 20;
        }
    }
}
