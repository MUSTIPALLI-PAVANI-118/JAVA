import java.util.ArrayList;
import java.util.Scanner;

class Expense {

    String category;
    double amount;

    Expense(String category, double amount) {

        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(new Expense(category, amount));

                    System.out.println("Expense Added");
                    break;

                case 2:

                    System.out.println("\nExpense List:");

                    for (Expense e : expenses) {

                        System.out.println(
                                e.category + " - Rs." + e.amount);
                    }
                    break;

                case 3:

                    double total = 0;

                    for (Expense e : expenses) {

                        total += e.amount;
                    }

                    System.out.println("Total Expense: Rs." + total);
                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
