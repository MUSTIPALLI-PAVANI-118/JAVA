import java.util.Scanner;

public class BankSystem {

    static double balance = 1000;
    static Scanner sc = new Scanner(System.in);

    static void deposit() {
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();

        balance += amount;

        System.out.println("Amount Deposited Successfully.");
    }

    static void withdraw() {
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
