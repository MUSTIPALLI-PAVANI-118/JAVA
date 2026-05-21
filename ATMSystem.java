import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    balance += sc.nextDouble();
                    System.out.println("Amount Deposited");
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
