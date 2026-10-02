import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) {
        String message;

        try {
            Socket socket = new Socket("localhost", 9000);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            BufferedReader serverInput = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter serverOutput = new PrintWriter(
                    socket.getOutputStream(), true);

            System.out.println("Connected to the Echo Server.");
            System.out.println("Enter a message or type 'exit' to stop.");

            while (true) {
                System.out.print("Client: ");
                message = keyboard.readLine();

                serverOutput.println(message);

                System.out.println("Server: " + serverInput.readLine());

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}