public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        // Start from last index and move backwards
        for (int i = arr.length - 1; i >= 0; i--) {

            // Print current element
            System.out.print(arr[i] + " ");
        }
    }
}
