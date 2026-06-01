import java.util.Scanner;
public class Equal_Operator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("both the numbers are equal");
        }
        else{
            System.out.println("both the numbers are not equal");
        }
        sc.close();
    }
}