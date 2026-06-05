import java.util.Scanner;
public class Lowercase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("CHARACTER IS lower CASE");
        }
        else{
            System.out.println("CHARACTER IS NOT A lower CASE");
        }
        sc.close();
    }
}