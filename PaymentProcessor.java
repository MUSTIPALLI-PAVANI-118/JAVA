// Each class has ONE job — separating payment logic from receipt/logging logic
class Payment {
    double amount;
    Payment(double amount) { this.amount = amount; }
}

class PaymentProcessor {
    void process(Payment payment) {
        System.out.println("Processing payment of " + payment.amount);
    }
}

class ReceiptGenerator {
    void generate(Payment payment) {
        System.out.println("Receipt: Paid " + payment.amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new Payment(1500);
        new PaymentProcessor().process(p);
        new ReceiptGenerator().generate(p);
    }
}
