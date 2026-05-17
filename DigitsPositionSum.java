import java.util.*;

public class DigitsPositionSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== DIGITS POSITION SUM =====");

        System.out.println("Enter number of integers:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter integers:");

        int maxDigits = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            int temp = Math.abs(arr[i]);

            int digits = String.valueOf(temp).length();

            maxDigits = Math.max(maxDigits, digits);
        }

        System.out.println("Digit position sums:");

        for (int pos = 0; pos < maxDigits; pos++) {

            int sum = 0;

            for (int i = 0; i < n; i++) {

                int temp = Math.abs(arr[i]);

                sum += (temp / (int)Math.pow(10, pos)) % 10;
            }

            System.out.print(sum + " ");
        }

        System.out.println();

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
