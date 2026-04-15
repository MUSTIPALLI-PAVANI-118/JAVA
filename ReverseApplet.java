import java.applet.Applet;
import java.awt.*;

public class ReverseApplet extends Applet {
    String str = "HELLO", rev = "";

    public void init() {
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
    }

    public void paint(Graphics g) {
        g.drawString("Original: " + str, 50, 50);
        g.drawString("Reversed: " + rev, 50, 70);
    }
}
