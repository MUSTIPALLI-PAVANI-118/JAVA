import java.util.*;

public class LeftRotateArray {
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int d = sc.nextInt();

        // Rotate left using three reversals.
        if (n > 0) {
            d %= n;
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
        }

        // Print rotated array.
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}

