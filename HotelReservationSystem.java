import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rooms[] = {
                "AC Room",
                "Non-AC Room",
                "Deluxe Room"
        };

        int prices[] = {
                2000,
                1200,
                3500
        };

        System.out.println("Available Rooms:");

        for (int i = 0; i < rooms.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                            rooms[i] + " - Rs." + prices[i]);
        }

        System.out.print("Select Room: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int total = prices[choice - 1] * days;

        System.out.println("\nBooking Confirmed");
        System.out.println("Room Type: " + rooms[choice - 1]);
        System.out.println("Days: " + days);
        System.out.println("Total Bill: Rs." + total);

        sc.close();
    }
}
