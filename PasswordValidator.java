import java.util.Scanner;

public class PasswordValidator {

    static boolean isValid(String password) {

        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[@#$%].*");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isValid(password)) {
            System.out.println("Strong password.");
        } else {
            System.out.println("Weak password.");
            System.out.println(
                "Password must contain uppercase, lowercase, digit, special character and 8+ characters."
            );
        }

        sc.close();
    }
}
