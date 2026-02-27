import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(accNo, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        b.withdraw(wd);

        b.display();
        sc.close();
    }
}

