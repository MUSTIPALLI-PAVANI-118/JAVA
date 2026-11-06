import java.util.Scanner;

public class Library_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Available Copies: ");
        int copies = sc.nextInt();

        if (copies > 0) {
            System.out.println(book + " is Available");
        } else if (copies == 0) {
            System.out.println(book + " is Not Available");
        } else {
            System.out.println("Invalid Number of Copies");
        }

        sc.close();
    }
}
