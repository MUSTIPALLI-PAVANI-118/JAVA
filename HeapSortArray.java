import java.util.*;

public class HeapSortArray {
    private static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Build max heap.
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        // Move maximum to the end one by one.
        for (int end = n - 1; end > 0; end--) {
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;
            heapify(arr, end, 0);
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}

