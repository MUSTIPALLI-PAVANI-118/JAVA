import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            double perimeter = a + b + c;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("\nValid Triangle");
            System.out.printf("Perimeter = %.2f%n", perimeter);
            System.out.printf("Area = %.2f%n", area);
        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
