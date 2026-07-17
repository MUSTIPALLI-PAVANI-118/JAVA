import java.util.Scanner;
public class Electricity {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units:");
        int units=sc.nextInt();
        System.out.println("enter amount for each unit:");
        double price=sc.nextDouble();
        double bill=units*price;
        System.out.println("total bill is "+bill);
        sc.close();
    }
}
