import java.util.Scanner;

public class StudentAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String students[] = {
                "Rahul",
                "Anjali",
                "Pavani",
                "Kiran"
        };

        boolean attendance[] = new boolean[students.length];

        for (int i = 0; i < students.length; i++) {

            System.out.print("Is " + students[i] + " present? (true/false): ");
            attendance[i] = sc.nextBoolean();
        }

        System.out.println("\nAttendance Report");

        for (int i = 0; i < students.length; i++) {

            System.out.println(
                    students[i] + " : " +
                            (attendance[i] ? "Present" : "Absent"));
        }

        sc.close();
    }
}
