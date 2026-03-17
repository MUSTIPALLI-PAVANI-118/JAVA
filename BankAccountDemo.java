class BankAccount {
    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Pavan");
        acc.deposit(1000);
        acc.withdraw(300);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }
}
