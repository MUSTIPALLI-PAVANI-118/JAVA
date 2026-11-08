import java.util.Scanner;

public class EmergencyPriority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type: ");
        String vehicle = sc.nextLine();

        if (vehicle.equalsIgnoreCase("Ambulance") ||
            vehicle.equalsIgnoreCase("Fire Engine")) {
            System.out.println("Emergency Vehicle - Give Priority");
        } else {
            System.out.println("Normal Traffic");
        }

        sc.close();
    }
}
