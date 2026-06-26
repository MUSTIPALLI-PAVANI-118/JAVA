import java.util.*;

public class WildcardPatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        String text = sc.next();
        int p = pattern.length();
        int t = text.length();

        // dp for wildcard pattern matching using one previous row.
        boolean[] previous = new boolean[t + 1];
        previous[0] = true;
        for (int i = 1; i <= p; i++) {
            boolean[] current = new boolean[t + 1];
            char pc = pattern.charAt(i - 1);
            if (pc == '*') current[0] = previous[0];
            for (int j = 1; j <= t; j++) {
                char tc = text.charAt(j - 1);
                if (pc == '*') current[j] = current[j - 1] || previous[j];
                else if (pc == '?' || pc == tc) current[j] = previous[j - 1];
            }
            previous = current;
        }

        System.out.println(previous[t] ? "True" : "False");
    }
}

