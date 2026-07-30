import java.util.Scanner;
public class Scanner_Char {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CHAR VALUE:");
        char ch=sc.next().charAt(0);
        System.out.println("CHARACTER VALUE IS "+ch);
        sc.close();
    }
}
