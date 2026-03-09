import java.util.Scanner;
class PaymentProcessor {
    void processPayment(double amount) {
        System.out.println("\n--- CASH PAYMENT ---");
        System.out.printf("Amount: ₹%.2f%n", amount);
        System.out.println("Payment Successful (Cash).");
    }
    void processPayment(double amount, String cardNumber, String cardHolder) {
        System.out.println("\n--- CARD PAYMENT ---");
        System.out.printf("Amount: ₹%.2f%n", amount);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number (masked): " + maskCard(cardNumber));
        System.out.println("Payment Successful (Card).");
    }
    void processPayment(double amount, String upiId) {
        System.out.println("\n--- UPI PAYMENT ---");
        System.out.printf("Amount: ₹%.2f%n", amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Successful (UPI).");
    }
    private String maskCard(String cardNumber) {
        if (cardNumber == null) return "Invalid";
        cardNumber = cardNumber.replaceAll("\\s+", "");
        if (cardNumber.length() < 4) return "XXXX";
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        return "XXXX-XXXX-XXXX-" + last4;
    }
}
public class Main_Payment_System_Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentProcessor pp = new PaymentProcessor();
        System.out.println("Choose Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. UPI");
        System.out.print("Enter choice (1/2/3): ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 
        switch (choice) {
            case 1:
                pp.processPayment(amount); 
                break;
            case 2:
                System.out.print("Enter card number: ");
                String cardNumber = sc.nextLine();
                System.out.print("Enter card holder name: ");
                String cardHolder = sc.nextLine();
                pp.processPayment(amount, cardNumber, cardHolder); 
                break;
            case 3:
                System.out.print("Enter UPI ID (example: name@bank): ");
                String upiId = sc.nextLine();
                pp.processPayment(amount, upiId); 
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
