import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventCaptureGUI extends JFrame implements KeyListener, MouseListener {

    JLabel label;

    EventCaptureGUI() {
        setTitle("Keyboard & Mouse Events");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Perform an action...");
        add(label);

        // Add listeners
        addKeyListener(this);
        addMouseListener(this);

        // Important: to receive key events
        setFocusable(true);
    }

    // 🔹 KeyListener methods
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    // 🔹 MouseListener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered Window");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited Window");
    }

    public static void main(String[] args) {
        new EventCaptureGUI().setVisible(true);
    }
}