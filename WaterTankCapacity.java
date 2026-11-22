
import java.util.Scanner;

public class WaterTankCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get tank dimensions in metres
        System.out.print("Enter tank length: ");
        double length = sc.nextDouble();

        System.out.print("Enter tank width: ");
        double width = sc.nextDouble();

        System.out.print("Enter tank height: ");
        double height = sc.nextDouble();

        // Calculate capacity in litres
        double capacity = length * width * height * 1000;

        System.out.println("Water Tank Capacity: " + capacity + " litres");

        sc.close();
    }
}
