
import java.util.Scanner;

public class AirplaneSeatAvailability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10];

        System.out.print("Enter seat number (1-10): ");
        int seat = sc.nextInt();

        if (seat < 1 || seat > 10) {
            System.out.println("Invalid seat number");
        } else if (!seats[seat - 1]) {
            seats[seat - 1] = true;
            System.out.println("Seat " + seat + " booked successfully");
        } else {
            System.out.println("Seat already booked");
        }

        sc.close();
    }
}
