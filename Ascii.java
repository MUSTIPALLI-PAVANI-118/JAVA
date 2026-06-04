import java.util.Scanner;
public class Ascii {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE CHARCHACTER:");
        char ch=sc.next().charAt(0);
        int ascii=(int)ch;
        System.out.println("ASCII VALUE OF CHARACTER IS:"+ascii);
        sc.close();
    }
}
