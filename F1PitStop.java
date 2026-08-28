import java.util.Scanner;

public class F1PitStop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== F1 PIT STOP =====");

        System.out.print("Enter pit stop time (seconds): ");
        double pitTime = sc.nextDouble();

        if (pitTime <= 2.5) {
            System.out.println("Excellent pit stop! 🔥");
        } 
        else if (pitTime <= 4.0) {
            System.out.println("Good pit stop.");
        } 
        else {
            System.out.println("Pit stop was too slow!");
        }

        System.out.printf("Pit Stop Time: %.2f seconds%n", pitTime);

        sc.close();
    }
}
