import java.util.Scanner;

class InvalidFormatException extends Exception {
    InvalidFormatException(String msg) {
        super(msg);
    }
}

class AuthenticationException extends Exception {
    AuthenticationException(String msg) {
        super(msg);
    }
}

public class LoginSystem {

    static void validate(String username, String password) throws InvalidFormatException, AuthenticationException {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new NullPointerException("Input cannot be null or empty");
        }

        if (!username.matches("[a-zA-Z0-9]+")) {
            throw new InvalidFormatException("Invalid username format");
        }

        String correctUser = "admin";
        String correctPass = "1234";

        if (!username.equals(correctUser) || !password.equals(correctPass)) {
            throw new AuthenticationException("Authentication failed");
        }

        System.out.println("Login successful");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        try {
            validate(username, password);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
