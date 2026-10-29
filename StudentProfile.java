import java.applet.Applet;
import java.awt.Graphics;

public class StudentProfile extends Applet {
    public void paint(Graphics g) {
        g.drawString("Student Name: Rahul", 50, 50);
        g.drawString("Course: BCA", 50, 70);
        g.drawString("Subject: Java", 50, 90);
    }
}
