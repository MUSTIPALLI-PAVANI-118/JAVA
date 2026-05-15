import java.util.Scanner;

public class ArraySortingProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int num : array) {

            System.out.print(num + " ");
        }

        sc.close();
    }
}
