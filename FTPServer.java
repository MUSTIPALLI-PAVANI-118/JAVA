import java.net.*;
import java.io.*;

public class FTPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);

            System.out.println("FTP Server started...");
            System.out.println("Waiting for client connection...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected successfully.");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("serverfile.txt"));

            String data;

            System.out.println("\nReceived File Contents:");

            while ((data = reader.readLine()) != null) {
                System.out.println(data);
                writer.write(data);
                writer.newLine();
            }

            writer.close();
            reader.close();
            socket.close();
            serverSocket.close();

            System.out.println(
                    "\nThe file was received from the client successfully.");

        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}