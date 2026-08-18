import java.util.Scanner;

public class PrimeNumberAnalyzer {

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;
        int sum = 0;
        int largest = -1;

        System.out.println("\nPrime Numbers:");

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");

                count++;
                sum += i;
                largest = i;
            }
        }

        System.out.println("\n\nCount: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Largest Prime: " + largest);

        sc.close();
    }
}
