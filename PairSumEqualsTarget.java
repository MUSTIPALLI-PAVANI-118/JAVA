import java.util.*;

public class PairSumEqualsTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long target = sc.nextLong();

        // Store seen values and check each needed complement.
        HashSet<Long> seen = new HashSet<>();
        boolean found = false;
        for (long value : arr) {
            if (seen.contains(target - value)) {
                found = true;
                break;
            }
            seen.add(value);
        }

        // Print whether such a pair exists.
        System.out.println(found);
        sc.close();
    }
}

