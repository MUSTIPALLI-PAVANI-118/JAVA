
import java.util.Scanner;

public class FloorTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get floor dimensions
        System.out.print("Enter floor length: ");
        double length = sc.nextDouble();

        System.out.print("Enter floor width: ");
        double width = sc.nextDouble();

        // Get tile area
        System.out.print("Enter area of one tile: ");
        double tileArea = sc.nextDouble();

        // Calculate total tiles required
        double floorArea = length * width;
        int tiles = (int) Math.ceil(floorArea / tileArea);

        System.out.println("Total Floor Area: " + floorArea);
        System.out.println("Tiles Required: " + tiles);

        sc.close();
    }
}
