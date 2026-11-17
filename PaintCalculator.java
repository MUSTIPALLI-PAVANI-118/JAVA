
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wall area in sq ft: ");
        double area = sc.nextDouble();

        System.out.print("Enter coverage per litre: ");
        double coverage = sc.nextDouble();

        double paint = area / coverage;

        System.out.println("Paint Required: " + paint + " litres");
    }
}
