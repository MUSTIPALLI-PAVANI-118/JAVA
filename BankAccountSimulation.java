import java.util.Scanner;

class BankAccount {

    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount("Pavani", 1000);

        acc.displayBalance();

        acc.deposit(500);

        acc.withdraw(300);

        acc.displayBalance();

        sc.close();
    }
}
