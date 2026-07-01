import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PingTest {
    public static void main(String[] args) {
        try {
            // Execute the ping command
            Process process = Runtime.getRuntime().exec("ping 127.0.0.1");
            // Read and display the output
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("===== Ping Result =====");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


