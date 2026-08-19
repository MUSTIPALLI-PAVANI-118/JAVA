import java.util.Scanner;

public class BankLoanCalculator {

    static double calculateEMI(
            double principal,
            double annualRate,
            int years) {

        double monthlyRate = annualRate / (12 * 100);
        int months = years * 12;

        return (principal * monthlyRate *
                Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter loan period (years): ");
        int years = sc.nextInt();

        double emi = calculateEMI(
                principal, rate, years
        );

        int months = years * 12;
        double totalPayment = emi * months;
        double totalInterest = totalPayment - principal;

        System.out.println("\n===== LOAN DETAILS =====");

        System.out.printf(
                "Monthly EMI     : ₹%.2f%n", emi
        );

        System.out.printf(
                "Total Payment   : ₹%.2f%n", totalPayment
        );

        System.out.printf(
                "Total Interest  : ₹%.2f%n", totalInterest
        );

        sc.close();
    }
}
