import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks[];

    Student(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 50)
            return "C";
        else
            return "Fail";
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter mark " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        System.out.println("\nStudent Report");

        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Average: " + s.calculateAverage());
            System.out.println("Grade: " + s.calculateGrade());
            System.out.println("---------------------");
        }

        sc.close();
    }
}
