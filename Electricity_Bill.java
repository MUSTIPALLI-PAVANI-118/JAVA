import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units:");
        int units=sc.nextInt();
        double amount;
        if(units<100){
            amount=units*3;
            System.out.println("electricity bill amount is:"+amount);
        }
        else if(units<200){
            amount=(units-100)*4+100*3;
            System.out.println("electricity bill amount is:"+amount);
        }
        else{
            amount=(units-200)*5+100*4+100*3;
            System.out.println("electricity bill amount is:"+amount);
        }
        sc.close();
    }
}
