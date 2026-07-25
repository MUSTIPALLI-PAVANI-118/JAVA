import java.util.Scanner;
public class Long_Mul{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st large number:");
        long m=sc.nextLong();
        System.out.println("enter 2nd large number:");
        long n=sc.nextLong();
        long mul=m*n;
        System.out.println("multiplication of long numbers:"+mul);
        sc.close();
    }
}