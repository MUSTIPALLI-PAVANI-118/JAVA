import java.util.Scanner;

public class StockMaxProfit {

    public static long maxProfit(int[] arr) {

        long profit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        long result = maxProfit(arr);

        System.out.println("Maximum Profit: " + result);

        sc.close();
    }
}
