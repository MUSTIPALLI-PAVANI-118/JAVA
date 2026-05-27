import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units of meter:");
        int units=sc.nextInt();
        System.out.println("enter cost of each unit(Rs):");
        double cost=sc.nextDouble();
        double bill=cost*units;
        System.out.println("TOTAL ELECTRICITY BILL IS:"+bill);
        sc.close();

    }
}
