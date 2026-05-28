import java.util.Scanner;
public class Equilateral {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of first side");
        int a=sc.nextInt();
        System.out.println("enter the length of second side");
        int b=sc.nextInt();
        System.out.println("enter the length of third side");
        int c=sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if(a==b && b==c){
                System.out.println("equilateral triangle");
            }
            else{
                System.out.println("Not an equilateral triangle");
            }
        }
        else{
            System.out.println("invalid");
        }
    
        sc.close();

    }
}
