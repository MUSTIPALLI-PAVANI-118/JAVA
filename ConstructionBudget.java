
import java.util.Scanner;

public class ConstructionBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get budget and expenses
        System.out.print("Enter total construction budget: ");
        double budget = sc.nextDouble();

        System.out.print("Enter amount spent: ");
        double spent = sc.nextDouble();

        // Check budget status
        if (budget < 0 || spent < 0) {
            System.out.println("Invalid Amount!");
        } else if (spent <= budget) {
            System.out.println("Within Budget!");
            System.out.println("Remaining Amount: Rs." + (budget - spent));
        } else {
            System.out.println("Budget Exceeded!");
            System.out.println("Extra Amount: Rs." + (spent - budget));
        }

        sc.close();
    }
}
