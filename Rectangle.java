import java.util.Scanner;
public class Rectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH:");
        int length=sc.nextInt();
        System.out.println("ENTER THE BREADTH:");
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("PERIMETER OF RECTANGLE:"+perimeter);
        int area=length*breadth;
        System.out.println("AREA OF RECTANGLE:"+area);
        sc.close();
    }
}