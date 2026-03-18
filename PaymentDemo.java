import java.util.Scanner;

// Interface defining common behavior
interface Payment {
    void processPayment(double amount);
}

// Credit Card Payment
class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs." + amount);
    }
}

// UPI Payment
class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs." + amount);
    }
}

// Main Class
public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Mode:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;  // Interface reference

        // Choosing payment mode
        switch (choice) {
            case 1:
                payment = new CreditCard();
                break;
            case 2:
                payment = new UPI();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        // Process payment
        payment.processPayment(amount);

        sc.close();
    }
}
