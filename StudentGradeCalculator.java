import java.util.Scanner;

public class StudentGradeCalculator {

    static char calculateGrade(double percentage) {
        if (percentage >= 90) return 'A';
        if (percentage >= 80) return 'B';
        if (percentage >= 70) return 'C';
        if (percentage >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = (double) total / n;
        char grade = calculateGrade(percentage);

        System.out.println("\nTotal Marks: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
