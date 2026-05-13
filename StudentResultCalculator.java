import java.util.Scanner;

public class StudentResultCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        int marks[] = new int[5];

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter mark for subject " + (i + 1) + ": ");

            marks[i] = sc.nextInt();

            total += marks[i];
        }

        double percentage = total / 5.0;

        System.out.println("\nTotal Marks: " + total);

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
