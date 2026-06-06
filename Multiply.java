import java.util.Scanner;
public class Multiply {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUMBER:"); 
        long m=sc.nextLong();
        System.out.println("ENTER THE 2ND NUMBER:"); 
        long n=sc.nextLong();
        long mul=m*n;
        System.out.println("MULTIPLICATION OF NUMBERS IS:"+mul);
        sc.close();
    }
}
