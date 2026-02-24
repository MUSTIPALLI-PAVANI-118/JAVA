import java.util.*;

public class ArrayDisplayUsingMethod {

    // CREATING A METHOD TO PRINT ARRAY ELEMENTS:
    static void printArray(int[] arr) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        // USER INPUT - (10 INTEGERS)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // PASS ARRAY TO THE METHOD TO PRINT ELEMENTS
        printArray(numbers);
        sc.close();
    }
}