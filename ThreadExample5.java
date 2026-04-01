class BankAccount {
    private int balance = 1000;

    // synchronized method
    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            try {
                Thread.sleep(1000); // simulate processing time
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class ThreadExample5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "User1");
        Customer c2 = new Customer(account, "User2");

        c1.start();
        c2.start();
    }
}
