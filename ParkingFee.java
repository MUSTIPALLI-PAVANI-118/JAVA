import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        int fee;

        if (hours <= 0) {
            System.out.println("Invalid parking hours");
        } else {
            fee = hours * 20;
            System.out.println("Parking Fee: Rs. " + fee);
        }

        sc.close();
    }
}
