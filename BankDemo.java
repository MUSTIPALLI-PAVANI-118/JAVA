abstract class Bank {

    abstract int getInterestRate();
}

class SBI extends Bank {

    int getInterestRate() {
        return 7;
    }
}

class HDFC extends Bank {

    int getInterestRate() {
        return 8;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}
