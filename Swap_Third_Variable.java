import java.util.Scanner;
public class Swap_Third_Variable {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER:");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("numbers after swapping are "+a +" and "+b );
        sc.close();
    }
    
}
