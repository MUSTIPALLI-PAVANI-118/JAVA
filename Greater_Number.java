import java.util.Scanner;
public class Greater_Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        if(a>=b){
            System.out.println("greatest number is "+a);
        }else{
            System.out.println("greatest number is "+b);
        }
        sc.close();
    }
}
