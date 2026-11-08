import java.util.Scanner;

public class NumberPlateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String registeredNumber = "AP21AB1234";

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        if (number.equalsIgnoreCase(registeredNumber)) {
            System.out.println("Vehicle Verified");
        } else {
            System.out.println("Vehicle Not Registered");
        }

        sc.close();
    }
}
