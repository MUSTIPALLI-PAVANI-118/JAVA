
import java.util.Scanner;

public class HouseArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter house length: ");
        double length = sc.nextDouble();

        System.out.print("Enter house width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Total House Area: " + area + " sq units");
    }
}
