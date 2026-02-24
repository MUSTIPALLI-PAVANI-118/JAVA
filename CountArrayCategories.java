import java.util.Scanner;

public class CountArrayCategories {

    // TO COUNT POSITIVE NUMBERS
    static int countPositive(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x > 0) count++;
        }
        return count;
    }

    // TO COUNT NEGATIVE NUMBERS
    static int countNegative(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x < 0) count++;
        }
        return count;
    }

    // TO COUNT EVEN NUMBERS
    static int countEven(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x % 2 == 0) count++;
        }
        return count;
    }

    // TO COUNT ODD NUMBERS
    static int countOdd(int[] arr) {
        int count = 0;
        for (int x : arr) {
            if (x % 2 != 0) count++;
        }
        return count;
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

        int pos = countPositive(arr);
        int neg = countNegative(arr);
        int even = countEven(arr);
        int odd = countOdd(arr);

        System.out.println("Positive count = " + pos);
        System.out.println("Negative count = " + neg);
        System.out.println("Even count     = " + even);
        System.out.println("Odd count      = " + odd);

        sc.close();
    }
}


