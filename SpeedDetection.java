import java.util.Scanner;

public class SpeedDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();

        if (speed > 60) {
            System.out.println("Over Speeding!");
        } 
        else {
            System.out.println("Speed is Normal");
        }

        sc.close();
    }
}
