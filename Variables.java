import java.util.Scanner;
public class Variables{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a(integer):");
        int a=sc.nextInt();
        System.out.println("enter the value of b(decimal):");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("enter the value of c(string):");
        String c=sc.nextLine();
        System.out.println("variables: a="+ a + " b="+ b + " c="+ c);
        sc.close();
    }
}