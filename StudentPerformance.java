import java.util.Scanner;

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks in Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter marks in Subject 5: ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.printf("%nStudent Name: %s%n", name);
        System.out.printf("Roll Number: %d%n", rollNo);
        System.out.printf("Total Marks: %d%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        sc.close();
    }
}
