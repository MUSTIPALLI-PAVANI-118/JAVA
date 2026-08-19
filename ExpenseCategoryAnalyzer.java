import java.util.HashMap;
import java.util.Map;

public class ExpenseCategoryAnalyzer {

    public static void main(String[] args) {

        HashMap<String, Double> expenses = new HashMap<>();

        expenses.put("Food", 2500.0);
        expenses.put("Travel", 4000.0);
        expenses.put("Education", 3000.0);
        expenses.put("Shopping", 5500.0);
        expenses.put("Entertainment", 2000.0);

        double total = 0;
        String highestCategory = "";
        double highestExpense = 0;

        System.out.println("===== EXPENSE ANALYSIS =====");

        for (Map.Entry<String, Double> entry
                : expenses.entrySet()) {

            System.out.printf(
                    "%-20s ₹%.2f%n",
                    entry.getKey(),
                    entry.getValue()
            );

            total += entry.getValue();

            if (entry.getValue() > highestExpense) {
                highestExpense = entry.getValue();
                highestCategory = entry.getKey();
            }
        }

        double average =
                total / expenses.size();

        System.out.println("------------------------------");
        System.out.printf("Total Expense: ₹%.2f%n", total);
        System.out.printf("Average: ₹%.2f%n", average);
        System.out.println(
                "Highest Category: " + highestCategory
        );
    }
}
