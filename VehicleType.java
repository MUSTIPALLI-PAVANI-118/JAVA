import java.util.Scanner;

public class VehicleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");
        System.out.println("4. Truck");

        System.out.print("Enter vehicle number: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Vehicle: Car");
                break;
            case 2:
                System.out.println("Vehicle: Bike");
                break;
            case 3:
                System.out.println("Vehicle: Bus");
                break;
            case 4:
                System.out.println("Vehicle: Truck");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
