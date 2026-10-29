import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Colors extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Red Text", 50, 50);

        g.setColor(Color.BLUE);
        g.drawString("Blue Text", 50, 80);

        g.setColor(Color.GREEN);
        g.drawString("Green Text", 50, 110);
    }
}
