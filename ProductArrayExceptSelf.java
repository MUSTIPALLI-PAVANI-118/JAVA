import java.util.*;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();

        // Store prefix products, then multiply by suffix products.
        long[] result = new long[n];
        long prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }
        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        // Print product array.
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result[i]);
        }
    }
}

