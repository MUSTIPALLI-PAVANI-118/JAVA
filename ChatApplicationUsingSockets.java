import java.io.*;
import java.net.*;

public class ChatApplicationUsingSockets {

    public static void main(String[] args) {

        try {

            ServerSocket server = new ServerSocket(5000);

            System.out.println("Waiting for client...");

            Socket socket = server.accept();

            System.out.println("Client Connected");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Welcome Client");

            String message = input.readLine();

            System.out.println("Client: " + message);

            socket.close();
            server.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
