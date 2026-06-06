import java.util.Scanner;
public class Uppercase_Lowercase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE UPPERCASE ALPHABET:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            ch=(char)(ch+32);
            System.out.println("LOWERCASE alphabet is:"+ch);
        }
        else{
            System.out.println("enter the uppercase alphabet");
        }
        sc.close();
    }
}
