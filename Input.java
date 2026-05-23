import java.util.Scanner;
public class Input{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer value:");
        int a=sc.nextInt();
        System.out.println("integer value is:"+a);
        System.out.println("enter decimal value:");
        double b=sc.nextDouble();
        System.out.println("decimal value is:"+b);
        sc.close();
    }
}