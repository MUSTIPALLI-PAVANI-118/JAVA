import java.util.Scanner;

public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Classes: ");
        int total = sc.nextInt();

        System.out.print("Enter Attended Classes: ");
        int attended = sc.nextInt();

        if (total <= 0 || attended < 0 || attended > total) {
            System.out.println("Invalid Input");
        } else {
            double percentage = (attended * 100.0) / total;

            System.out.println("Attendance: " + percentage + "%");

            if (percentage >= 75) {
                System.out.println("Eligible for Examination");
            } else {
                System.out.println("Not Eligible for Examination");
            }
        }

        sc.close();
    }
}
