import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius=sc.nextDouble();
        double perimeter=2*3.14*radius;
        System.out.println("PERIMETER OF CIRCLE:"+perimeter);
        double area=3.14*radius*radius;
        System.out.println("AREA OF CIRCLE:"+area);
        sc.close();
    }
}
