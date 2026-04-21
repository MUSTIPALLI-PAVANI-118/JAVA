import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class DateApplet extends Applet {
    public void paint(Graphics g) {
        Date d = new Date();
        g.drawString("Current Date: " + d.toString(), 20, 50);
    }
}
