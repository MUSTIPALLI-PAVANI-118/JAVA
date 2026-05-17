import java.util.*;

public class CoinChangeWays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COIN CHANGE - NUMBER OF WAYS =====");

        System.out.println("Enter number of coins:");

        int n = sc.nextInt();

        int[] coins = new int[n];

        System.out.println("Enter coin values:");

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");

        int sum = sc.nextInt();

        int[] dp = new int[sum + 1];

        dp[0] = 1;

        for (int coin : coins) {

            for (int j = coin; j <= sum; j++) {
                dp[j] += dp[j - coin];
            }
        }

        System.out.println("Number of ways to form sum:");
        System.out.println(dp[sum]);

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
