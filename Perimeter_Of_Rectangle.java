import java.util.Scanner;
public class Perimeter_Of_Rectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of rectangle:");
        double length=sc.nextDouble();
        System.out.print("enter the breadth of rectangle:");
        double breadth =sc.nextDouble();
        double perimeter=(2*(length+breadth));
        System.out.println("perimeter of rectangle:"+perimeter);
        sc.close();
    }
}