// Interface
interface Payment {
    void pay(double amount);
}

// Implementation 1
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// Implementation 2
class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Implementation 3
class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

// Main class
public class PaymentSystemDemo {
    public static void main(String[] args) {

        Payment p;

        // Using Credit Card
        p = new CreditCardPayment();
        p.pay(1000);

        // Using UPI
        p = new UpiPayment();
        p.pay(500);

        // Using Cash
        p = new CashPayment();
        p.pay(200);
    }
}
