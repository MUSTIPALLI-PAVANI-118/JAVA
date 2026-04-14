import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeApplet extends Applet implements ActionListener {
    Button b;

    public void init() {
        b = new Button("Change Color");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        setBackground(Color.pink);
    }
}
