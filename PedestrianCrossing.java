import java.util.Scanner;

public class PedestrianCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the pedestrian signal ON? (yes/no): ");
        String signal = sc.nextLine();

        if (signal.equalsIgnoreCase("yes")) {
            System.out.println("Pedestrians Can Cross");
        } else {
            System.out.println("Pedestrians Must Wait");
        }

        sc.close();
    }
}
