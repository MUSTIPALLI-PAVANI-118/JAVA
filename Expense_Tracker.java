import java.util.ArrayList;

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

        ArrayList<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("Food", 250));
        expenses.add(new Expense("Travel", 500));
        expenses.add(new Expense("Shopping", 1200));
        expenses.add(new Expense("Food", 300));

        double total = 0;

        System.out.println("===== EXPENSES =====");

        for (Expense expense : expenses) {
            System.out.printf("%-15s ₹%.2f%n",
                    expense.category,
                    expense.amount);

            total += expense.amount;
        }

        System.out.println("--------------------");
        System.out.printf("Total Expense: ₹%.2f%n", total);
    }
}
