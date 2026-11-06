import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        if (marks >= 85 && marks <= 100) {
            System.out.println(name + " is Eligible for Scholarship");
        } else if (marks >= 0 && marks < 85) {
            System.out.println(name + " is Not Eligible for Scholarship");
        } else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}
