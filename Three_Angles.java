import java.util.Scanner;
public class Three_Angles {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st angle:");
        double a=sc.nextDouble();
        System.out.println("enter 2nd angle:");
        double b=sc.nextDouble();
        System.out.println("enter 3rd angle:");
        double c=sc.nextDouble();
        if(a+b+c==180){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("not a valid triangle");
        }
        sc.close();
    }
}
