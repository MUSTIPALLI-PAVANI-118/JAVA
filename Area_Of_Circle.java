import java.util.Scanner;
public class Area_Of_Circle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radius of circle:");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle:"+area);
        sc.close();
    }
}