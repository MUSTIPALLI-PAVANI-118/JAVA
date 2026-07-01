import java.io.*;
import java.net.*;
import java.nio.file.*;
public class client {
    private static final String HOST = "localhost";
    private static final int PORT = 4000;
    private static final String IMAGE_PATH = "KRISHNA.jpg";
    public static void main(String[] args) {
        System.out.println("Client is running...");
        try (
            Socket soc = new Socket(HOST, PORT);
            DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(soc.getOutputStream())
            )
        ) {
            System.out.println("Reading image from disk...");
            byte[] bytes = Files.readAllBytes(Paths.get(IMAGE_PATH));
            System.out.println("Sending image to server...");
            dos.writeInt(bytes.length);
            dos.write(bytes);
            dos.flush();
            System.out.println("Image sent to server...");
        } 
        catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}