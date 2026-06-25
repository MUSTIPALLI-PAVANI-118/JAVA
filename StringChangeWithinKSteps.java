import java.util.*;

public class StringChangeWithinKSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String target = sc.next();
        String source = sc.next();

        // Only replacements are allowed, so lengths must match.
        if (target.length() != source.length()) {
            System.out.println("No");
            return;
        }
        int changes = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != source.charAt(i)) changes++;
        }

        System.out.println(changes <= k ? "Yes" : "No");
    }
}

