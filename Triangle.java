import java.util.Scanner;
public class Triangle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st side:");
        int a=sc.nextInt();
        System.out.println("enter 2nd side:");
        int b=sc.nextInt();
        System.out.println("enter 3rd side:");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("valid triangle");
        }else{
            System.out.println("Invalid triangle");
        }
        sc.close();
    }
}
