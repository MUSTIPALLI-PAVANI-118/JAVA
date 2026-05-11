import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usdRate = 83.0;
        double euroRate = 90.0;

        System.out.println("1. INR to USD");
        System.out.println("2. INR to EURO");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("USD: " + (inr / usdRate));
                break;

            case 2:
                System.out.println("EURO: " + (inr / euroRate));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
