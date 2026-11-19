
import java.util.Scanner;

public class Worker_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of workers: ");
        int workers = sc.nextInt();

        System.out.print("Enter daily salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter working days: ");
        int days = sc.nextInt();

        double total = workers * salary * days;

        System.out.println("Total Worker Salary: Rs." + total);
    }
}
