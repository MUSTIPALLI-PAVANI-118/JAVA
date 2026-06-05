import java.util.Scanner;
public class Lowercase_Uppercase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LOWERCASE ALPHABET:");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            ch=(char)(ch-32);
            System.out.println("uppercase alphabet is:"+ch);
        }
        else{
            System.out.println("enter the lowercase alphabet");
        }
        sc.close();
    }
}
