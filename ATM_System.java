import java.util.Scanner;

public class ATM_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();

        if (wd <= balance) {
            balance = balance - wd;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        } 
        else {
            System.out.println("Insufficient balance");
            System.out.println("Available balance: " + balance);
        }

        sc.close();
    }
}

