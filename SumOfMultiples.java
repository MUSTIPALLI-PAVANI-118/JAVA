import java.util.*;

public class SumOfMultiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SUM OF MULTIPLES OF X =====");

        System.out.println("Enter value of X:");
        int X = sc.nextInt();

        System.out.println("Enter value of A:");
        int A = sc.nextInt();

        System.out.println("Enter value of B:");
        int B = sc.nextInt();

        long sum = 0;

        for (int i = A; i <= B; i++) {

            if (i % X == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of multiples:");
        System.out.println(sum);

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
