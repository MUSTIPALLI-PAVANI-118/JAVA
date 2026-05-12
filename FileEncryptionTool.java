import java.util.Scanner;

public class FileEncryptionTool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            encrypted += (char) (ch + 3);
        }

        System.out.println("Encrypted Text: " + encrypted);

        String decrypted = "";

        for (int i = 0; i < encrypted.length(); i++) {

            char ch = encrypted.charAt(i);

            decrypted += (char) (ch - 3);
        }

        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}
