import java.net.*;
import java.io.*;

public class FTPClient {
    public static void main(String[] args) {
        try {
            FileInputStream file =
                    new FileInputStream("clientfile.txt");

            Socket socket = new Socket("localhost", 3000);

            PrintWriter writer = new PrintWriter(
                    socket.getOutputStream(), true);

            BufferedReader fileReader = new BufferedReader(
                    new InputStreamReader(file));

            String data;

            System.out.println("File Contents Sent to Server:");

            while ((data = fileReader.readLine()) != null) {
                writer.println(data);
                System.out.println(data);
            }

            fileReader.close();
            file.close();
            writer.close();
            socket.close();

            System.out.println(
                    "\nThe file was transferred to the server successfully.");

        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}