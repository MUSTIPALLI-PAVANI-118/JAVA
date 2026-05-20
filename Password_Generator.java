import java.util.Random;
import java.util.Scanner;

public class Password_Generator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789@#$%&*";

        System.out.print("Enter Password Length: ");
        int length = sc.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(characters.length());

            password += characters.charAt(index);
        }

        System.out.println("\nGenerated Password:");
        System.out.println(password);
    }
}
