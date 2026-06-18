import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Count each character first.
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) count[s.charAt(i)]++;

        // Find first character with count one.
        char answer = '$';
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                answer = s.charAt(i);
                break;
            }
        }

        System.out.println(answer);
    }
}

