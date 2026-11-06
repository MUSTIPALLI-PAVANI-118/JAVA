import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usn = {
            "101", "102", "103", "104", "105"
        };

        System.out.print("Enter USN to Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < usn.length; i++) {
            if (usn[i].equals(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student Found");
        } else {
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}
