import java.applet.Applet;
import java.awt.*;

public class MultiColorApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(20, 20, 50, 50);

        g.setColor(Color.green);
        g.fillRect(80, 20, 50, 50);

        g.setColor(Color.blue);
        g.fillRect(140, 20, 50, 50);
    }
}
