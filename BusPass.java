import java.util.Scanner;

public class BusPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance in KM: ");
        double distance = sc.nextDouble();

        double fee;

        if (distance <= 0) {
            System.out.println("Invalid Distance");
        } else if (distance <= 10) {
            fee = 500;
            System.out.println("Bus Pass Fee: " + fee);
        } else if (distance <= 20) {
            fee = 800;
            System.out.println("Bus Pass Fee: " + fee);
        } else {
            fee = 1200;
            System.out.println("Bus Pass Fee: " + fee);
        }

        sc.close();
    }
}
