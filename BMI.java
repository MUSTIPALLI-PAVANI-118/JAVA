import java.util.Scanner;
public class BMI {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight:");
        double w=sc.nextInt();
        System.out.println("enter height:");
        double h=sc.nextInt();
        double bmi=w/(h*h);
        System.out.println("BODY MASS INDEX:"+bmi);
        sc.close();
    }
}
