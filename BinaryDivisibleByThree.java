import java.util.*;

public class BinaryDivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Build only the remainder to avoid overflow.
        int remainder = 0;
        for (int i = 0; i < s.length(); i++) {
            remainder = (remainder * 2 + (s.charAt(i) - '0')) % 3;
        }

        // Divisible if remainder is zero.
        System.out.println(remainder == 0);
    }
}

