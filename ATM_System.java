import java.util.Scanner;

class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000);

        int choice;

        do {
            System.out.println("\n===== ATM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
