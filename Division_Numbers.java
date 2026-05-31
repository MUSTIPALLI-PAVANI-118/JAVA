import java.util.Scanner;
public class Division_Numbers{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        double num1=sc.nextDouble();
        System.out.print("enter second number:");
        double num2=sc.nextDouble();
        double Division_Numbers=num1/num2;
        System.out.println("Division of numbers is:"+Division_Numbers);
        sc.close();
    }
}
