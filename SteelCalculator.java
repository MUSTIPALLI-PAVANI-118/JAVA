
import java.util.Scanner;

public class SteelCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get steel weight
        System.out.print("Enter steel weight in kg: ");
        double weight = sc.nextDouble();

        // Get price per kg
        System.out.print("Enter price per kg: ");
        double price = sc.nextDouble();

        // Calculate total steel cost
        double total = weight * price;

        System.out.println("Total Steel Cost: Rs." + total);

        sc.close();
    }
}
