
import java.util.Scanner;

public class DoorWindowCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of doors: ");
        int doors = sc.nextInt();

        System.out.print("Enter number of windows: ");
        int windows = sc.nextInt();

        int total = doors + windows;

        System.out.println("Total Doors and Windows: " + total);
    }
}
