import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void displayAccount() {
        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("--------------------------------");
    }
}

public class BankingSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();

    public static void createAccount() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        accounts.add(new Account(accNo, name, balance));

        System.out.println("Account Created Successfully.");
    }

    public static Account findAccount(int accNo) {

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }

        return null;
    }

    public static void depositMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();

            acc.deposit(amount);

        } else {

            System.out.println("Account Not Found.");
        }
    }

    public static void withdrawMoney() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);

        } else {

            System.out.println("Account Not Found.");
        }
    }

    public static void checkBalance() {

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {

            acc.displayAccount();

        } else {

            System.out.println("Account Not Found.");
        }
    }

    public static void displayAllAccounts() {

        if (accounts.isEmpty()) {

            System.out.println("No Accounts Available.");
            return;
        }

        System.out.println("\n===== All Bank Accounts =====");

        for (Account acc : accounts) {

            acc.displayAccount();
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n====== Banking System ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank You for Using Banking System.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
