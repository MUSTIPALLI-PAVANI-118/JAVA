import java.util.Scanner;

public class LoginAttemptSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String correctUsername = "admin";
        final String correctPassword = "java123";

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            attempts++;

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                System.out.println("Login Successful!");
                loggedIn = true;
                break;

            } else {

                System.out.println(
                        "Invalid username or password."
                );

                System.out.println(
                        "Attempts remaining: " + (3 - attempts)
                );
            }
        }

        if (!loggedIn) {
            System.out.println("Account Locked!");
        }

        sc.close();
    }
}
