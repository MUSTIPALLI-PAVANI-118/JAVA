import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Compare characters from both ends.
        int left = 0;
        int right = s.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}

