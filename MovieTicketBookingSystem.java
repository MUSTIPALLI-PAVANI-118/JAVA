import java.util.Scanner;

public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String movies[] = {
                "Leo",
                "Avengers",
                "Pushpa"
        };

        int price = 150;

        System.out.println("Available Movies:");

        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }

        System.out.print("Select Movie: ");
        int choice = sc.nextInt();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        int total = tickets * price;

        System.out.println("\nBooking Successful");
        System.out.println("Movie: " + movies[choice - 1]);
        System.out.println("Tickets: " + tickets);
        System.out.println("Total Amount: " + total);

        sc.close();
    }
}
