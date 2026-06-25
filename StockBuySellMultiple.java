import java.util.*;

public class StockBuySellMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] price = new long[n];
        for (int i = 0; i < n; i++) price[i] = sc.nextLong();

        // Add every positive day-to-day gain.
        long profit = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] > price[i - 1]) profit += price[i] - price[i - 1];
        }

        System.out.println(profit);
    }
}

