import java.util.*;

public class MaxConsecutiveOnesAfterFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        // Sliding window keeps at most k zeros.
        int left = 0;
        int zeros = 0;
        int best = 0;
        for (int right = 0; right < n; right++) {
            if (arr[right] == 0) zeros++;
            while (zeros > k) {
                if (arr[left] == 0) zeros--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }

        System.out.println(best);
    }
}

