import java.util.*;

public class SwapLastTwoDigitsSum {

    public static int swapLastTwo(int num) {

        int last = num % 10;
        int secondLast = (num / 10) % 10;
        int remaining = num / 100;

        return remaining * 100 + last * 10 + secondLast;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SWAP LAST TWO DIGITS =====");

        System.out.println("Enter two integers:");

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int newX = swapLastTwo(X);
        int newY = swapLastTwo(Y);

        int sum = newX + newY;

        System.out.println("Result:");
        System.out.println(sum);

        System.out.println("Program completed successfully!");

        sc.close();
    }
}
