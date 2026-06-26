import java.util.*;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) weight[i] = sc.nextInt();
        for (int i = 0; i < n; i++) value[i] = sc.nextInt();

        // One-dimensional 0/1 knapsack DP.
        long[] dp = new long[capacity + 1];
        for (int i = 0; i < n; i++) {
            for (int w = capacity; w >= weight[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weight[i]] + value[i]);
            }
        }

        System.out.println(dp[capacity]);
    }
}

