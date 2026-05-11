import java.util.Scanner;

class ATM {

    private int pin = 1234;
    private double balance = 5000;

    void start() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN");
            return;
        }

        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Amount Deposited");
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance");
                    } else {
                        balance -= withdraw;
                        System.out.println("Amount Withdrawn");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

public class ATMInterface {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.start();
    }
}
