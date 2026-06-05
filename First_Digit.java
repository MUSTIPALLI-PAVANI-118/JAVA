import java.util.Scanner;
public class First_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        n = Math.abs(n);
        while (n >= 10) {
            n = n / 10;
        }
        System.out.println("First digit is: " + n);
        sc.close();
    }
}
