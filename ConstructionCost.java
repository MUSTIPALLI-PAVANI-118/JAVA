
import java.util.Scanner;

public class ConstructionCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter house area: ");
        double area = sc.nextDouble();

        System.out.print("Enter cost per sq ft: ");
        double cost = sc.nextDouble();

        double totalCost = area * cost;

        System.out.println("Total Construction Cost: Rs." + totalCost);
    }
}
