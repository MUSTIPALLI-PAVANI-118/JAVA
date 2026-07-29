import java.util.Scanner;
public class Scanner_Boolean {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BOOLEAN VALUE:");
        boolean value=sc.nextBoolean();
        System.out.println("BOOLEAN VALUE IS "+value);
        sc.close();
    }
}