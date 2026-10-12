
import java.util.Scanner;

class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private int capacity;

    public Flight(String flightNumber, String source,
                  String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
    }

    public void displayDetails() {
        System.out.println("\n--- Flight Details ---");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Seat Capacity: " + capacity);
    }
}

public class AirplaneFlightManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter flight number: ");
        String number = sc.nextLine();

        System.out.print("Enter source: ");
        String source = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter seat capacity: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Invalid seat capacity");
        } else {
            Flight flight = new Flight(
                number, source, destination, capacity
            );

            flight.displayDetails();
        }

        sc.close();
    }
}
