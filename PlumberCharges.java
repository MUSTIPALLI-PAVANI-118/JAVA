
import java.util.Scanner;

public class PlumberCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get plumber details
        System.out.print("Enter number of plumbers: ");
        int plumbers = sc.nextInt();

        System.out.print("Enter daily wage per plumber: ");
        double wage = sc.nextDouble();

        System.out.print("Enter number of working days: ");
        int days = sc.nextInt();

        // Calculate total plumbing charges
        double total = plumbers * wage * days;

        System.out.println("Total Plumbing Charges: Rs." + total);

        sc.close();
    }
}
