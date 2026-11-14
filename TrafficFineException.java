import java.util.Scanner;

public class TrafficFineException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter vehicle speed: ");
            int speed = sc.nextInt();

            if (speed < 0) {
                throw new IllegalArgumentException("Invalid Speed");
            }

            if (speed > 60) {
                System.out.println("Traffic Fine: Rs. 500");
            } else {
                System.out.println("No Fine");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
