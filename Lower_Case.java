import java.util.Scanner;
public class Lower_Case {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("LOWER CASE LETTER");
        }
        else{
            System.out.println("NOT AN LOWER CASE LETTER");
        }
    sc.close();
    }
}
