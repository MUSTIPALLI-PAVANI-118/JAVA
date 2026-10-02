import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        String message;

        try {
            ServerSocket serverSocket = new ServerSocket(9000);

            System.out.println("Echo Server started.");
            System.out.println("Waiting for the client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
                output.println(message);
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}