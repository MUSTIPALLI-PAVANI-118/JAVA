
import java.util.Scanner;

public class AirplaneFlightStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter flight number: ");
        String flightNumber = sc.nextLine().trim().toUpperCase();

        String status;

        switch (flightNumber) {
            case "AI101":
                status = "On Time";
                break;
            case "AI202":
                status = "Delayed";
                break;
            case "AI303":
                status = "Cancelled";
                break;
            default:
                status = "Flight Not Found";
        }

        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Flight Status: " + status);

        sc.close();
    }
}
