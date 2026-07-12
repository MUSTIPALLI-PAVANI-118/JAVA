import java.util.Scanner;
public class Arithmetic_Operators {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER 1ST NUMBER:");
        int num1=sc.nextInt();
        System.out.print("ENTER 2ND NUMBER:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int diff=num1-num2;
        int mul=num1*num2;
        double div = (double) num1 / num2;
        int remainder=num1%num2;
        int quotient=num1/num2;
        System.out.println("SUM OF NUMBERS IS:"+sum);
        System.out.println("DIFFERENCE OF NUMBERS IS:"+diff);
        System.out.println("MULTIPLICATION OF NUMBERS IS:"+mul);
        System.out.println("DIVISON OF NUMBERS IS:"+div);
        System.out.println("REMAINDER OF NUMBERS IS:"+remainder);
        System.out.println("QUOTIENT OF NUMBERS IS:"+quotient);
        sc.close();
    }
}
