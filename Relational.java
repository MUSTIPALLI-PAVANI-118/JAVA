import java.util.Scanner;
public class Relational {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUM1:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE NUM2:");
        int num2=sc.nextInt();
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        sc.close();
    }
}
