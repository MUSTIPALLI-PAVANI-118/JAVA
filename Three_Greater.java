import java.util.Scanner;
public class Three_Greater {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter 3rd number:");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("greater number is:"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("greater number is:"+b);
        }
        else{
            System.out.println("greater number is:"+c);
        }
        sc.close();
    }
}
