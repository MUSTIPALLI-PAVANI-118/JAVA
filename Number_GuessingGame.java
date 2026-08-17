import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100.");

        while (true) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            attempts++;

            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct!");
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
