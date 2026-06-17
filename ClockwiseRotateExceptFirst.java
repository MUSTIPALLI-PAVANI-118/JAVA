import java.util.*;

public class ClockwiseRotateExceptFirst {
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
        int k = sc.nextInt();

        // Rotate only the part after the first element.
        int length = n - 1;
        if (length > 0) {
            k %= length;
            reverse(arr, 1, n - 1);
            reverse(arr, 1, k);
            reverse(arr, k + 1, n - 1);
        }

        // Print revised array.
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}

