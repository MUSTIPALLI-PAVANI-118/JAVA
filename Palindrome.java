import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(reverse==original){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        sc.close();
    }
}
