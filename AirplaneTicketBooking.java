
import java.util.Scanner;

public class AirplaneTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("\n--- Ticket Confirmed ---");
        System.out.println("Passenger: " + name);
        System.out.println("Age: " + age);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Status: Booked");

        sc.close();
    }
}
