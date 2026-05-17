import java.util.*;

public class EvenIntegersReverseOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EVEN INTEGERS - REVERSE ORDER =====");

        System.out.println("Enter values of X and Y:");

        int X = sc.nextInt();
        int Y = sc.nextInt();

        boolean found = false;

        System.out.println("Even integers in reverse order:");

        for (int i = Y - 1; i > X; i--) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }

        System.out.println();

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
