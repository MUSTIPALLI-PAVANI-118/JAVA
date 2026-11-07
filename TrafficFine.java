import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();

        if (speed <= 60) {
            System.out.println("No Fine");
        } 
        else if (speed <= 80) {
            System.out.println("Fine: Rs. 500");
        } 
        else {
            System.out.println("Fine: Rs. 1000");
        }

        sc.close();
    }
}
