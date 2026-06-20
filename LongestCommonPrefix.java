import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prefix = sc.next();

        // Shrink the prefix until every string starts with it.
        for (int i = 1; i < n; i++) {
            String word = sc.next();
            while (!word.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) break;
            }
        }

        System.out.println(prefix);
    }
}

