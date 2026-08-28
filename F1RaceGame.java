import java.util.Scanner;

public class F1RaceGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int speed = 100;
        int lap = 1;

        System.out.println("================================");
        System.out.println("       🏎️ F1 RACING GAME 🏎️");
        System.out.println("================================");

        System.out.print("Enter driver name: ");
        String driver = sc.nextLine();

        System.out.println("\nWelcome, " + driver + "!");
        System.out.println("Race has started!");

        while (lap <= 5) {

            System.out.println("\n----- LAP " + lap + " -----");
            System.out.println("Current Speed: " + speed + " km/h");

            System.out.println("1. Accelerate");
            System.out.println("2. Brake");
            System.out.println("3. Continue");

            System.out.print("Choose action: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    speed += 30;
                    System.out.println("Accelerating! 🚀");
                    break;

                case 2:
                    speed -= 20;

                    if (speed < 50) {
                        speed = 50;
                    }

                    System.out.println("Braking! 🛑");
                    break;

                case 3:
                    System.out.println("Maintaining speed...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (speed > 350) {
                speed = 350;
                System.out.println("Maximum speed reached!");
            }

            lap++;
        }

        System.out.println("\n================================");
        System.out.println("🏁 RACE FINISHED! 🏁");
        System.out.println("Driver: " + driver);
        System.out.println("Final Speed: " + speed + " km/h");
        System.out.println("Congratulations!");
        System.out.println("================================");

        sc.close();
    }
}
