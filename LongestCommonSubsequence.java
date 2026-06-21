import java.util.*;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = s1.length();
        int m = s2.length();

        // One-dimensional LCS DP.
        int[] dp = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            int previousDiagonal = 0;
            for (int j = 1; j <= m; j++) {
                int saved = dp[j];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = previousDiagonal + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                previousDiagonal = saved;
            }
        }

        System.out.println(dp[m]);
    }
}

