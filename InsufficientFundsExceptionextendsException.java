class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Remaining: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(500);
        try {
            acc.withdraw(700);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
