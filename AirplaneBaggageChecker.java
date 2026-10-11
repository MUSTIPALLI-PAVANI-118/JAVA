
import java.util.Scanner;

public class AirplaneBaggageChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double LIMIT = 15.0;
        final double RATE = 500.0;

        System.out.print("Enter baggage weight (kg): ");
        double weight = sc.nextDouble();

        if (weight < 0) {
            System.out.println("Invalid baggage weight");
        } else if (weight <= LIMIT) {
            System.out.println("Baggage allowed without extra charges");
        } else {
            double extra = weight - LIMIT;
            double charge = extra * RATE;

            System.out.println("Extra weight: " + extra + " kg");
            System.out.println("Extra charge: Rs. " + charge);
        }

        sc.close();
    }
}
