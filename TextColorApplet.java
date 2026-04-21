import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TextColorApplet extends Applet implements ActionListener {
    Button red, green, blue;
    Color c = Color.black;

    public void init() {
        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red)
            c = Color.red;
        else if (e.getSource() == green)
            c = Color.green;
        else if (e.getSource() == blue)
            c = Color.blue;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.drawString("Color Changing Text", 50, 100);
    }
}
