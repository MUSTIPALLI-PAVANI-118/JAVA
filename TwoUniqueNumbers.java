import java.util.*;

public class TwoUniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long xor = 0;

        // XOR of all values leaves xor of the two unique values.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            xor ^= arr[i];
        }

        // Split numbers by a differing bit.
        long mask = xor & -xor;
        long first = 0;
        long second = 0;
        for (long value : arr) {
            if ((value & mask) == 0) first ^= value;
            else second ^= value;
        }

        // Print in increasing order.
        if (first > second) {
            long temp = first;
            first = second;
            second = temp;
        }
        System.out.println(first + " " + second);
    }
}

