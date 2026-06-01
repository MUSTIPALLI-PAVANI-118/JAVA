import java.util.Scanner;
public class Mul_Numbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();
        int multiplication=num1*num2;
        System.out.println("multiplication of numbers is:"+multiplication);
        sc.close();
    }
}