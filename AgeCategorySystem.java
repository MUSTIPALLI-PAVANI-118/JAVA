import java.util.Scanner;

public class AgeCategorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        String category = switch (age / 10) {
            case 0 -> "Child";
            case 1 -> "Teenager";
            case 2, 3, 4, 5 -> "Adult";
            default -> "Senior Citizen";
        };

        System.out.println("Age Category: " + category);

        sc.close();
    }
}
