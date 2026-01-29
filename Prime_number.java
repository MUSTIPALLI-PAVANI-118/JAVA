import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF NUM:");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("ENTERED NUM IS PRIME NUMBER");
        } else {
            System.out.println("ENTERED NUM IS NOT A PRIME NUMBER");
        }

        sc.close();
    }
}
