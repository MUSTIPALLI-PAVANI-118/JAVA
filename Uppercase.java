import java.util.Scanner;
public class Uppercase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("CHARACTER IS UPPER CASE");
        }
        else{
            System.out.println("CHARACTER IS NOT AN UPPER CASE");
        }
        sc.close();
    }
}
