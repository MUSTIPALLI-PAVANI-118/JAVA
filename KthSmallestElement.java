import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

    public static int findKthSmallest(int[] arr, int k) {

        Arrays.sort(arr);
        return arr[k - 1];
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = findKthSmallest(arr, k);

        System.out.println("Kth Smallest Element: " + result);

        sc.close();
    }
}
