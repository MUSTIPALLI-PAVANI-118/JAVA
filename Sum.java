import java.util.Scanner;
public class Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b value:");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of a and b value:"+sum);
        sc.close();
    }
}