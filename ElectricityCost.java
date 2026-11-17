
import java.util.Scanner;

public class ElectricityCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units used: ");
        double units = sc.nextDouble();

        System.out.print("Enter cost per unit: ");
        double rate = sc.nextDouble();

        double bill = units * rate;

        System.out.println("Electricity Bill: Rs." + bill);
    }
}
