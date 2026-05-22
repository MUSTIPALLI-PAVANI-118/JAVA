import java.util.Scanner;
public class Boolean_Input{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter boolean value(true/false):");
        boolean x=sc.nextBoolean();
        System.out.println("boolean input is:"+x);
        sc.close();
    }
}