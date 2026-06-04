import java.util.Scanner;
public class Alphabet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER:");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            System.out.println("ENTERED CHARACTER IS ALPHABET");
        }
        else{
            System.out.println("ENTERED CHARACTER IS NOT AN ALPHABET");
        }
        sc.close();
    }
}
