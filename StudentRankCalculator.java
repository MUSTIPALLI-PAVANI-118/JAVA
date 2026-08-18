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

public class StudentRankCalculator {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Pavan", 88));
        students.add(new Student(102, "Rahul", 76));
        students.add(new Student(103, "Priya", 95));
        students.add(new Student(104, "Arun", 82));

        students.sort(
                Comparator.comparingDouble(
                        (Student s) -> s.marks
                ).reversed()
        );

        System.out.println("===== STUDENT RANKING =====");

        int rank = 1;

        for (Student student : students) {

            System.out.printf(
                    "Rank %d -> ",
                    rank++
            );

            student.display();
        }
    }
}
