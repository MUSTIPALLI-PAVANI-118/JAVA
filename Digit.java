import java.util.Scanner;
public class Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch=sc.next().charAt(0);
        if(ch>='0' && ch<='9'){
            System.out.println("CHARACTER IS DIGIT");
        }
        else{
            System.out.println("CHARACTER IS NOT A DIGIT");
        }
        sc.close();
    }
}