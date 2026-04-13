import java.applet.Applet;
import java.awt.*;

public class ImageApplet extends Applet {
    Image img;

    public void init() {
        img = getImage(getCodeBase(), "sample.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(img, 50, 50, this);
    }
}
