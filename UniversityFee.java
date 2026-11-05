import java.util.Scanner;

public class UniversityFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tuition Fee: ");
        double tuition = sc.nextDouble();

        System.out.print("Enter Library Fee: ");
        double library = sc.nextDouble();

        System.out.print("Enter Exam Fee: ");
        double exam = sc.nextDouble();

        double total = tuition + library + exam;

        System.out.println("Total University Fee: " + total);

        sc.close();
    }
}
