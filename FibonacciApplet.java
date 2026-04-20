import java.applet.Applet;
import java.awt.*;

public class FibonacciApplet extends Applet {
    public void paint(Graphics g) {
        int a = 0, b = 1, c;
        String series = a + " " + b;

        for (int i = 2; i < 10; i++) {
            c = a + b;
            series = series + " " + c;
            a = b;
            b = c;
        }

        g.drawString("Fibonacci: " + series, 20, 50);
    }
}
