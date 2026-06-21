import java.util.*;

public class MaximumIndexDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

        // Precompute best values from the left and right.
        long[] leftMin = new long[n];
        long[] rightMax = new long[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) rightMax[i] = Math.max(rightMax[i + 1], arr[i]);

        // Move two pointers to maximize j - i with arr[i] < arr[j].
        int i = 0;
        int j = 0;
        int answer = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                answer = Math.max(answer, j - i);
                j++;
            } else {
                i++;
            }
        }

        System.out.println(answer);
    }
}

