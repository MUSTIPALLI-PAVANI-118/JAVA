import java.io.*;
import java.net.*;
import javax.swing.*;
public class server {
    private static final int PORT = 4000;
    public static void main(String[] args) {
        System.out.println("Server Waiting for image");
        try (ServerSocket server = new ServerSocket(PORT)) {
            try (
                Socket socket = server.accept();
                DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream())
                )
            ) {
                System.out.println("Client connected...");
                int len = dis.readInt();
                System.out.println("Image Size: " + len / 1024 + "KB");
                byte[] data = new byte[len];
                dis.readFully(data);
                displayImage(data);
            }
        } 
        catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
    private static void displayImage(byte[] data) {
        JFrame frame = new JFrame("Server");
        ImageIcon icon = new ImageIcon(data);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}