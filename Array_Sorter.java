import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("\nSorted Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
