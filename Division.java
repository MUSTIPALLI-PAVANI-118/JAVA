import java.util.Scanner;
public class Division {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        double num=sc.nextDouble();
        num /= 2.0;
        System.out.println("finally number is:"+num);
        sc.close();
    }
}
