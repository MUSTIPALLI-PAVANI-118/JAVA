import java.util.*;

public class PairDivisibilityByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        // Pair complementary remainders.
        int[] count = new int[k];
        for (int value : arr) {
            int remainder = ((value % k) + k) % k;
            count[remainder]++;
        }
        boolean possible = count[0] % 2 == 0;
        for (int r = 1; r <= k / 2 && possible; r++) {
            if (r == k - r) possible = count[r] % 2 == 0;
            else possible = count[r] == count[k - r];
        }

        System.out.println(possible);
    }
}

