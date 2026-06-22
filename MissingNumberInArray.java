import java.util.*;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Start with the sum of 1 to n.
        long missing = (long) n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++) {
            missing -= sc.nextLong();
        }

        // The remaining value is the missing number.
        System.out.println(missing);
    }
}

