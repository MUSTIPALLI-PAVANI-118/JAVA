import java.util.Scanner;
public class Triangle_Valid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st side:");
        int a=sc.nextInt();
        System.out.println("enter the 2nd side:");
        int b=sc.nextInt();
        System.out.println("enter the 3rd side:");
        int c=sc.nextInt();
        if(a + b > c && b + c > a && a + c > b){
            System.out.println("valid triangle");
        }
        else {
            System.out.println("not a valid triangle");
        }
        sc.close();

    }
}
