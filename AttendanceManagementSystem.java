import java.util.ArrayList;

class StudentAttendance {

    int rollNo;
    String name;
    int totalClasses;
    int attendedClasses;

    StudentAttendance(
            int rollNo,
            String name,
            int totalClasses,
            int attendedClasses) {

        this.rollNo = rollNo;
        this.name = name;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    double getPercentage() {

        return (attendedClasses * 100.0)
                / totalClasses;
    }

    void display() {

        System.out.printf(
                "%-8d %-15s %-10d %-10d %.2f%%%n",
                rollNo,
                name,
                totalClasses,
                attendedClasses,
                getPercentage()
        );
    }
}

public class AttendanceManagementSystem {

    public static void main(String[] args) {

        ArrayList<StudentAttendance> students =
                new ArrayList<>();

        students.add(
                new StudentAttendance(
                        101, "Pavan", 60, 55
                )
        );

        students.add(
                new StudentAttendance(
                        102, "Rahul", 60, 45
                )
        );

        students.add(
                new StudentAttendance(
                        103, "Priya", 60, 58
                )
        );

        System.out.printf(
                "%-8s %-15s %-10s %-10s %s%n",
                "Roll", "Name",
                "Classes", "Present", "Percentage"
        );

        System.out.println(
                "------------------------------------------------"
        );

        for (StudentAttendance student : students) {

            student.display();

            if (student.getPercentage() < 75) {
                System.out.println(
                        "  ⚠ Attendance shortage!"
                );
            }
        }
    }
}
