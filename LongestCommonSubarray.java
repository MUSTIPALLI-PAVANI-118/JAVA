import java.util.*;

public class LongestCommonSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        // DP stores lengths ending at the current positions.
        int[] dp = new int[n + 1];
        int bestLength = 0;
        int bestEnd = -1;
        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                if (a[i - 1] == b[j - 1]) {
                    dp[j] = dp[j - 1] + 1;
                    if (dp[j] > bestLength) {
                        bestLength = dp[j];
                        bestEnd = i - 1;
                    }
                } else {
                    dp[j] = 0;
                }
            }
        }

        // Print the first longest subarray from A.
        for (int i = bestEnd - bestLength + 1; i <= bestEnd; i++) {
            if (i > bestEnd - bestLength + 1) System.out.print(" ");
            System.out.print(a[i]);
        }
    }
}

