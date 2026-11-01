import java.util.Scanner;

public class MetroTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        System.out.print("Enter source station: ");
        String source = sc.nextLine();

        System.out.print("Enter destination station: ");
        String destination = sc.nextLine();

        System.out.print("Enter ticket fare: ");
        double fare = sc.nextDouble();

        System.out.println("\n--- METRO TICKET ---");
        System.out.println("Passenger: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: Rs." + fare);

        sc.close();
    }
}
