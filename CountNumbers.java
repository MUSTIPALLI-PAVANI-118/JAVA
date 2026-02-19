import java.util.Scanner;

class CountNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pos = 0, neg = 0, even = 0, odd = 0;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0)
                pos++;
            else if (arr[i] < 0)
                neg++;

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
        sc.close();
    }
}
