import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Series:");
        System.out.print("1 ");
        sum = 1;
        int term = 5;
        while (term <= n) {
            System.out.print("+ " + term + " ");
            sum = sum + term;
            term = term + 5;
        }
        System.out.println("\nSum of the series = " + sum);
        sc.close();
    }
}

