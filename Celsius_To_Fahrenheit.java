import java.util.Scanner;
public class Celsius_To_Fahrenheit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature:");
        double c=sc.nextDouble();
        double f=((9.0/5.0)*c)+32;
        System.out.println("temperatue in fahrenheit:"+f);
        sc.close();
    }
}