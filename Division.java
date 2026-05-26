import java.util.Scanner;
public class Division {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int num=sc.nextInt();
        System.out.print("ENTER THE DIVISOR:");
        int divisor=sc.nextInt();
        int quotient=num/divisor;
        int remainder=num%divisor;
        System.out.println("QUOTIENT IS "+quotient);
        System.out.println("REMAINDER IS "+remainder);
        sc.close();
    }
}