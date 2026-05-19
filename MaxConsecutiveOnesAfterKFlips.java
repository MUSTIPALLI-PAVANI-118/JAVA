import java.util.Scanner;

public class MaxConsecutiveOnesAfterKFlips {

    public static int longestOnes(int[] arr, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter binary array (0s and 1s):");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = longestOnes(arr, k);

        System.out.println("Maximum consecutive 1's after flips: " + result);

        sc.close();
    }
}
