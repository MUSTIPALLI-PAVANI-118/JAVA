import java.util.Scanner;

public class ProductArrayExceptSelf {

    public static long[] productExceptSelf(int[] arr) {

        int n = arr.length;
        long[] res = new long[n];

        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }

        long right = 1;

        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= arr[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        long[] result = productExceptSelf(arr);

        System.out.print("Product Array: ");

        for (long val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
