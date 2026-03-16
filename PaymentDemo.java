abstract class Payment {

    abstract void pay();
}

class CreditCard extends Payment {

    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI extends Payment {

    void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay();
        p2.pay();
    }
}
