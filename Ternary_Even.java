import java.util.Scanner;
public class Ternary_Even {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        String result=(num%2==0)? "even":"odd";
        System.out.println("number is "+result);
        sc.close();
    }
}
