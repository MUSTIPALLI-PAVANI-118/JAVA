public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5, 6, 2, 7};

        int sum = 0;  // stores total

        // Go from first element to last element
        for (int i = 0; i < arr.length; i++) {

            // Add current element to sum
            sum = sum + arr[i];
        }

        // Print final sum
        System.out.println(sum);
    }
}
