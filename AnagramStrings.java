import java.util.*;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        // Same length and same character frequencies are required.
        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int value : count) {
            if (value != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}

