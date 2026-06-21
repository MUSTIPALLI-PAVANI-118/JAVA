import java.util.*;

public class MaxDotProductWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        // Choose m positions in a while preserving b order.
        long negative = Long.MIN_VALUE / 4;
        long[] dp = new long[m + 1];
        Arrays.fill(dp, negative);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(i + 1, m); j >= 1; j--) {
                dp[j] = Math.max(dp[j], dp[j - 1] + (long) a[i] * b[j - 1]);
            }
        }

        System.out.println(dp[m]);
    }
}

