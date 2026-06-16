import java.util.*;

public class AddBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // Add bits from right to left.
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        // Remove leading zeros from the final answer.
        result.reverse();
        int start = 0;
        while (start < result.length() - 1 && result.charAt(start) == '0') start++;
        System.out.println(result.substring(start));
    }
}

