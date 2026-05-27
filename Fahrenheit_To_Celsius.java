import java.util.Scanner;
public class Fahrenheit_To_Celsius{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature:");
        double f=sc.nextDouble();
        double c=(5.0/9.0)*(f-32);
        System.out.println("temperatue in celsius:"+c);
        sc.close();
    }
}

