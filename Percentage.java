import java.util.Scanner;
public class Percentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter percentage:");
        double p=sc.nextDouble();
        if(p>=90){
            System.out.println("distinction");
        }
        else if(p>=75){
            System.out.println("first class");
        }
        else if(p>=50){
            System.out.println("second class");
        }
        else if(p>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        sc.close();
    }
}
