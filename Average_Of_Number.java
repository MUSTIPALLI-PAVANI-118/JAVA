import java.util.Scanner;
public class Average_Of_Number{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:");
        int a =sc.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        int b =sc.nextInt();
        System.out.print("ENTER THIRD NUMBER:");
        int c =sc.nextInt();
        double average=(a+b+c)/3.0;
        System.out.println("AVERAGE OF 3 NUMBERS:"+average);
        sc.close();
    }
}
