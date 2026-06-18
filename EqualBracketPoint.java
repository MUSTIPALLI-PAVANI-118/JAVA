import java.util.*;

public class EqualBracketPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Count all closing brackets first.
        int totalClose = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') totalClose++;
        }

        // Try every split index k.
        int openBefore = 0;
        int closeBefore = 0;
        for (int k = 0; k <= s.length(); k++) {
            int closeFromHere = totalClose - closeBefore;
            if (openBefore == closeFromHere) {
                System.out.println(k);
                return;
            }
            if (k < s.length()) {
                if (s.charAt(k) == '(') openBefore++;
                else closeBefore++;
            }
        }

        System.out.println(-1);
    }
}

