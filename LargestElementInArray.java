import java.util.Scanner;

public class LargestElementInArray {

    // CREATE A METHOD TO FIND THE LARGEST ELEMENT IN AN ARRAY
    static int findLargest(int[] arr) {
        int largest = arr[0];              
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {        
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = findLargest(arr);
        System.out.println("Largest element = " + largest);

        sc.close();
    }
}
