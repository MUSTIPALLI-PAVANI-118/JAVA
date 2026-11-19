
import java.util.Scanner;

public class SandCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get sand quantity
        System.out.print("Enter sand quantity in units: ");
        double quantity = sc.nextDouble();

        // Get cost per unit
        System.out.print("Enter cost per unit: ");
        double price = sc.nextDouble();

        // Calculate total cost
        double total = quantity * price;

        System.out.println("Total Sand Cost: Rs." + total);

        sc.close();
    }
}
