import java.util.ArrayList;
import java.util.Comparator;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.printf(
            "%-8d %-15s %.2f%n",
            rollNo, name, marks
        );
    }
}

public class Student_ManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Pavan", 88));
        students.add(new Student(102, "Rahul", 76));
        students.add(new Student(103, "Priya", 95));
        students.add(new Student(104, "Arun", 82));

        System.out.println("===== STUDENTS =====");

        for (Student student : students) {
            student.display();
        }

        students.sort(
            Comparator.comparingDouble(
                (Student s) -> s.marks
            ).reversed()
        );

        System.out.println("\n===== SORTED BY MARKS =====");

        for (Student student : students) {
            student.display();
        }
    }
}
