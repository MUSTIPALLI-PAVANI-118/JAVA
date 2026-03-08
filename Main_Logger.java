import java.util.Scanner;
class Logger {
    void log(String message) {
        System.out.println("Log Message: " + message);
    }
    void log(String message, String timestamp) {
        System.out.println("Log Message: " + message + " | Timestamp: " + timestamp);
    }
    void log(String message, String timestamp, int errorCode) {
        System.out.println("Log Message: " + message + " | Timestamp: " + timestamp + " | Error Code: " + errorCode);
    }
}
public class Main_Logger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger l = new Logger();

        System.out.println("Choose logging option:");
        System.out.println("1. Log only message");
        System.out.println("2. Log message with timestamp");
        System.out.println("3. Log message with timestamp and error code");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter message: ");
            String message = sc.nextLine();
            l.log(message);
        }
        else if (choice == 2) {
            System.out.print("Enter message: ");
            String message = sc.nextLine();

            System.out.print("Enter timestamp: ");
            String timestamp = sc.nextLine();

            l.log(message, timestamp);
        }
        else if (choice == 3) {
            System.out.print("Enter message: ");
            String message = sc.nextLine();

            System.out.print("Enter timestamp: ");
            String timestamp = sc.nextLine();

            System.out.print("Enter error code: ");
            int errorCode = sc.nextInt();

            l.log(message, timestamp, errorCode);
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}