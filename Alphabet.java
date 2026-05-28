import java.util.Scanner;
public class Alphabet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch <='Z'){
            System.out.println("upper case letter");
        }
        else if(ch>='a' && ch <='z'){
            System.out.println("lower case letter");
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
    
}
