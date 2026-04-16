import java.applet.Applet;
import java.awt.*;

public class ParamApplet extends Applet {
    String name;

    public void init() {
        name = getParameter("username");
    }

    public void paint(Graphics g) {
        g.drawString("Hello " + name, 50, 50);
    }
}
