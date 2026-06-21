import java.util.*;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Apply Kadane's algorithm.
        long current = 0;
        long best = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();
            if (i == 0) {
                current = value;
                best = value;
            } else {
                current = Math.max(value, current + value);
                best = Math.max(best, current);
            }
        }

        // Print maximum subarray sum.
        System.out.println(best);
    }
}

