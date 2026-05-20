import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense Added Successfully");
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No Expenses Found");
            return;
        }

        double total = 0;

        System.out.println("\n===== Expense List =====");

        for (Expense expense : expenses) {
            System.out.println(expense);
            total += expense.getAmount();
        }

        System.out.println("\nTotal Expense: ₹" + total);
    }
}
