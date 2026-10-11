
import java.util.Scanner;

public class AirplaneFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Economy Class");
        System.out.println("2. Business Class");
        System.out.println("3. First Class");

        System.out.print("Enter class choice: ");
        int choice = sc.nextInt();

        double fare;

        switch (choice) {
            case 1:
                fare = 5000;
                break;
            case 2:
                fare = 12000;
                break;
            case 3:
                fare = 25000;
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.print("Enter number of passengers: ");
        int passengers = sc.nextInt();

        if (passengers <= 0) {
            System.out.println("Invalid passenger count");
        } else {
            double total = fare * passengers;
            System.out.println("Total Ticket Fare: Rs. " + total);
        }

        sc.close();
    }
}
