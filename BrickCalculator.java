
import java.util.Scanner;

public class BrickCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of walls: ");
        int walls = sc.nextInt();

        System.out.print("Enter bricks required per wall: ");
        int bricks = sc.nextInt();

        int totalBricks = walls * bricks;

        System.out.println("Total Bricks Required: " + totalBricks);
    }
}
