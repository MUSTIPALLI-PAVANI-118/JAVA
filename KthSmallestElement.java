import java.util.*;

public class KthSmallestElement {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int left, int right, Random random) {
        int pivotIndex = left + random.nextInt(right - left + 1);
        swap(arr, pivotIndex, right);
        int pivot = arr[right];
        int store = left;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                swap(arr, store, i);
                store++;
            }
        }
        swap(arr, store, right);
        return store;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        // Quickselect finds kth element without fully sorting.
        int target = k - 1;
        int left = 0;
        int right = n - 1;
        Random random = new Random(1);
        while (left <= right) {
            int pivot = partition(arr, left, right, random);
            if (pivot == target) {
                System.out.println(arr[pivot]);
                return;
            } else if (pivot < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
    }
}

