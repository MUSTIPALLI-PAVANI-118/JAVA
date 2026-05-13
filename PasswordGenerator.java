import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        Random random = new Random();

        String password = "";

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(characters.length());

            password += characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
