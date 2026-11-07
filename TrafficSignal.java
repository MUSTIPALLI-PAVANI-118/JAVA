import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal color: ");
        String color = sc.nextLine();

        if (color.equalsIgnoreCase("Red")) {
            System.out.println("STOP");
        } 
        else if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("WAIT");
        } 
        else if (color.equalsIgnoreCase("Green")) {
            System.out.println("GO");
        } 
        else {
            System.out.println("Invalid Signal");
        }

        sc.close();
    }
}
