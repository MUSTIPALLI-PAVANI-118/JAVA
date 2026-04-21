import java.applet.Applet;
import java.awt.*;

public class BallApplet extends Applet implements Runnable {
    int x = 0;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > 300) x = 0;
            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 50, 30, 30);
    }
}
