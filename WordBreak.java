import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) dictionary.add(sc.next());
        String s = sc.next();

        // dp[i] is true if s[0..i-1] can be segmented.
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        System.out.println(dp[s.length()] ? 1 : 0);
    }
}

