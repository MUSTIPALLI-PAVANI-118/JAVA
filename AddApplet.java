import java.applet.Applet;
import java.awt.Graphics;

public class AddApplet extends Applet {
    int a = 10, b = 20, sum;

    public void init() {
        sum = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("Sum = " + sum, 50, 50);
    }
}
