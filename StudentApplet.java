import java.applet.Applet;
import java.awt.Graphics;

public class StudentApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Name: Pavani", 20, 20);
        g.drawString("Roll No: 12345", 20, 40);
        g.drawString("Course: CSE", 20, 60);
    }
}
