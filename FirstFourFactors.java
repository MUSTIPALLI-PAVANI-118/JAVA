import java.util.*;

public class FirstFourFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== FIRST FOUR FACTORS =====");

        System.out.println("Enter value of N:");

        int N = sc.nextInt();

        int count = 0;

        System.out.println("Factors:");

        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {

                System.out.print(i + " ");

                count++;

                if (count == 4) {
                    break;
                }
            }
        }

        System.out.println();

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
