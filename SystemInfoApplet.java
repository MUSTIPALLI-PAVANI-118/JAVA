import java.applet.Applet;
import java.awt.*;

public class SystemInfoApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Java Version: " + System.getProperty("java.version"), 20, 30);
        g.drawString("OS Name: " + System.getProperty("os.name"), 20, 50);
        g.drawString("User Name: " + System.getProperty("user.name"), 20, 70);
    }
}
