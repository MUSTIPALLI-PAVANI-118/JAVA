import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number: " + num);
        System.out.println("Type: " + result);
        System.out.println("Square: " + (num * num));
        System.out.println("Cube: " + (num * num * num));

        sc.close();
    }
}
