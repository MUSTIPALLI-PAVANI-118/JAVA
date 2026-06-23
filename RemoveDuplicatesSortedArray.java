import java.util.*;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        if (n == 0) return;

        // Keep one copy of each distinct value.
        int write = 1;
        for (int read = 1; read < n; read++) {
            if (arr[read] != arr[write - 1]) {
                arr[write] = arr[read];
                write++;
            }
        }

        // Print distinct values.
        for (int i = 0; i < write; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}

