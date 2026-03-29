import java.util.Scanner;

public class InputExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt(); // May cause InputMismatchException

            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            sc.close();
        }
    }
}
