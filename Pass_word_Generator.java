import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    static String generatePassword(int length) {

        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "@#$%&*!";

        Random random = new Random();

        StringBuilder password =
                new StringBuilder();

        for (int i = 0; i < length; i++) {

            int index =
                    random.nextInt(characters.length());

            password.append(
                    characters.charAt(index)
            );
        }

        return password.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter password length: "
        );

        int length = sc.nextInt();

        if (length < 6) {

            System.out.println(
                    "Password length must be at least 6."
            );

        } else {

            String password =
                    generatePassword(length);

            System.out.println(
                    "Generated Password: " + password
            );
        }

        sc.close();
    }
}
