import java.util.Scanner;

public class F1Speed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        double speed = distance / time;

        System.out.println("\n===== RACE PERFORMANCE =====");
        System.out.printf("Distance : %.2f km%n", distance);
        System.out.printf("Time     : %.2f hours%n", time);
        System.out.printf("Speed    : %.2f km/h%n", speed);

        sc.close();
    }
}
