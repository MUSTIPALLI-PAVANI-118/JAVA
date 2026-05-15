import java.util.Scanner;

public class BankLoanEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        if (age >= 21 && salary >= 25000 && creditScore >= 700) {

            System.out.println("Eligible for Loan");

        } else {

            System.out.println("Not Eligible for Loan");
        }

        sc.close();
    }
}
