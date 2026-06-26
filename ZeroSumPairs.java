import java.util.*;

public class ZeroSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Sort and use two pointers to avoid duplicate pairs.
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        ArrayList<String> pairs = new ArrayList<>();
        while (left < right) {
            long sum = arr[left] + arr[right];
            if (sum == 0) {
                pairs.add("[" + arr[left] + ", " + arr[right] + "]");
                long a = arr[left];
                long b = arr[right];
                while (left < right && arr[left] == a) left++;
                while (left < right && arr[right] == b) right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        // Print pairs in sorted order.
        System.out.println("[" + String.join(", ", pairs) + "]");
    }
}

