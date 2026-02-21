import java.util.Scanner;

class Reverse_Copy_Of_Array 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy in reverse order
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }

        System.out.println("Elements of second array in reverse order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
        } 
}

