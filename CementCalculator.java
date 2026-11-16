
import java.util.Scanner;

public class CementCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cement bags required per room: ");
        int bags = sc.nextInt();

        System.out.print("Enter number of rooms: ");
        int rooms = sc.nextInt();

        int totalBags = bags * rooms;

        System.out.println("Total Cement Bags Required: " + totalBags);
    }
}
