import java.util.Scanner;
interface BookingService {
    void bookRide(String pickup, String drop);
}
interface PaymentService {
    void makePayment(double amount);
}
class RideService implements BookingService, PaymentService {
    String pickupLocation;
    String dropLocation;
    public void bookRide(String pickup, String drop) {
        this.pickupLocation = pickup;
        this.dropLocation = drop;
        System.out.println("Ride Booked Successfully!");
        System.out.println("Pickup: " + pickupLocation);
        System.out.println("Drop: " + dropLocation);
    }
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " Successful!");
    }
}

public class RideServiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pickup Location: ");
        String pickup = sc.nextLine();
        System.out.print("Enter Drop Location: ");
        String drop = sc.nextLine();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        RideService ride = new RideService();
        ride.bookRide(pickup, drop);
        ride.makePayment(amount);
        sc.close();
    }
}

