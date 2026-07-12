import java.util.Scanner;
public class Ascii {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st character:");
        char ch1=sc.next().charAt(0);
        System.out.println("enter 2nd character:");
        char ch2=sc.next().charAt(0);
        System.out.println(ch1>ch2);
        System.out.println(ch1<ch2);
        System.out.println(ch1==ch2);
        sc.close();
    }
}
