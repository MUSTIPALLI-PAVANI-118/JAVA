import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable {
    String time;
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while(true) {
            time = new Date().toString();
            repaint();
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(time, 50, 50);
    }
}
