import java.util.Scanner;

public class TrafficCongestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles on road: ");
        int vehicles = sc.nextInt();

        if (vehicles < 0) {
            System.out.println("Invalid vehicle count");
        } else if (vehicles <= 20) {
            System.out.println("Low Traffic");
        } else if (vehicles <= 50) {
            System.out.println("Medium Traffic");
        } else {
            System.out.println("Heavy Traffic");
        }

        sc.close();
    }
}
