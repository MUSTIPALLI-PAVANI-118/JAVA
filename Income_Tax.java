import java.util.Scanner;
public class Income_Tax {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter income amount:");
        int tax =sc.nextInt();
        double amount;
        if(tax<1000){
            amount=tax+tax*(2/100);
            System.out.println("tax is "+amount);
        }

        sc.close();
    }
}
