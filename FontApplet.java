import java.applet.Applet;
import java.awt.*;

public class FontApplet extends Applet {
    public void paint(Graphics g) {
        Font f1 = new Font("Serif", Font.BOLD, 20);
        Font f2 = new Font("SansSerif", Font.ITALIC, 20);

        g.setFont(f1);
        g.drawString("Bold Text", 50, 50);

        g.setFont(f2);
        g.drawString("Italic Text", 50, 80);
    }
}
