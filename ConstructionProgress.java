
import java.util.Scanner;

public class ConstructionProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter completed work percentage: ");
        double progress = sc.nextDouble();

        if (progress >= 0 && progress <= 100) {
            System.out.println("Construction Progress: " + progress + "%");

            if (progress == 100) {
                System.out.println("House Construction Completed!");
            } else {
                System.out.println("Construction Still in Progress.");
            }
        } else {
            System.out.println("Invalid Percentage!");
        }
    }
}
