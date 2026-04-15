import java.applet.Applet;
import java.awt.*;

public class RandomApplet extends Applet {
    int num;

    public void init() {
        num = (int)(Math.random() * 100);
    }

    public void paint(Graphics g) {
        g.drawString("Random Number: " + num, 50, 50);
    }
}
