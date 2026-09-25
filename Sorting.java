import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 4, 3};

        // Sort from smallest to largest
        Arrays.sort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
