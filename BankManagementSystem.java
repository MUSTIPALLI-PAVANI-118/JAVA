import java.util.Scanner;
import java.util.ArrayList;

class Account {
    int accountNumber;
    String accountHolder;
    double balance;

    Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("-------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.printf("Balance        : ₹%.2f%n", balance);
        System.out.println("-------------------------------------");
    }
}

public class BankManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();

    static Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accNo) {
                return acc;
            }
        }
        return null;
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        if (findAccount(accNo) != null) {
            System.out.println("Account already exists.");
            return;
        }

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ");
        double amount = sc.nextDouble();

        accounts.add(new Account(accNo, name, amount));
        System.out.println("Account Created Successfully!");
    }

    static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc == null) {
            System.out.println("Account Not Found.");
            return;
        }

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
            return;
        }

        acc.balance += amount;
        System.out.println("Deposit Successful.");
        System.out.printf("Updated Balance: ₹%.2f%n", acc.balance);
    }

    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc == null) {
            System.out.println("Account Not Found.");
            return;
        }

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
        } else if (amount > acc.balance) {
            System.out.println("Insufficient Balance.");
        } else {
            acc.balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.printf("Remaining Balance: ₹%.2f%n", acc.balance);
        }
    }

    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accNo);

        if (acc != null) {
            System.out.printf("Current Balance: ₹%.2f%n", acc.balance);
        } else {
            System.out.println("Account Not Found.");
        }
    }

    static void transferMoney() {
        System.out.print("From Account Number: ");
        int fromAcc = sc.nextInt();

        System.out.print("To Account Number: ");
        int toAcc = sc.nextInt();

        Account sender = findAccount(fromAcc);
        Account receiver = findAccount(toAcc);

        if (sender == null || receiver == null) {
            System.out.println("Invalid Account Number.");
            return;
        }

        System.out.print("Enter Amount to Transfer: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
        } else if (amount > sender.balance) {
            System.out.println("Insufficient Balance.");
        } else {
            sender.balance -= amount;
            receiver.balance += amount;
            System.out.println("Money Transferred Successfully.");
        }
    }

    static void displayAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No Accounts Available.");
            return;
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");

        for (Account acc : accounts) {
            acc.displayDetails();
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== BANK MANAGEMENT SYSTEM ==========");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Money");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    transferMoney();
                    break;

                case 6:
                    displayAccounts();
                    break;

                case 7:
                    System.out.println("Thank you for using Bank Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
