import java.util.*;

public class EvenSumOrFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EVEN SUM OR FACTORS =====");

        System.out.println("Enter values of M and N:");

        int M = sc.nextInt();
        int N = sc.nextInt();

        System.out.println("Result:");

        if (M % 2 == 0) {

            for (int i = 1; i <= N; i++) {

                int lastDigit = i % 10;
                int secondLastDigit = (i / 10) % 10;

                int sum = lastDigit + secondLastDigit;

                if (sum % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

        } else {

            for (int i = 1; i <= N; i++) {

                int root = (int)Math.sqrt(i);

                if (root * root != i) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
