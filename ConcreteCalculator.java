
import java.util.Scanner;

public class ConcreteCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get concrete structure dimensions
        System.out.print("Enter length in metres: ");
        double length = sc.nextDouble();

        System.out.print("Enter width in metres: ");
        double width = sc.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = sc.nextDouble();

        // Calculate concrete volume
        double volume = length * width * height;

        System.out.println("Concrete Required: " + volume + " cubic metres");

        sc.close();
    }
}
