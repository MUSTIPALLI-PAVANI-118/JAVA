import java.util.Scanner;
interface Payment {
    void processPayment(double amount);
}
class CreditCard implements Payment {
    String cardNumber;
    void getCardDetails(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount Paid: " + amount);
    }
}
class UPI implements Payment {
    String upiId;
    void getUPIDetails(String upiId) {
        this.upiId = upiId;
    }
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount Paid: " + amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 
        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int choice = sc.nextInt();
        sc.nextLine();
        Payment p; 
        if (choice == 1) {
            System.out.print("Enter Card Number: ");
            String card = sc.nextLine();
            CreditCard cc = new CreditCard();
            cc.getCardDetails(card);
            p = cc; 
        } else {
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            UPI u = new UPI();
            u.getUPIDetails(upi);
            p = u; 
        }
        p.processPayment(amount);
        sc.close();
    }
}



