import java.util.*;

public class CoinChangeWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();
        int sum = sc.nextInt();

        // dp[x] stores combinations that make amount x.
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int amount = coin; amount <= sum; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }

        System.out.println(dp[sum]);
    }
}

