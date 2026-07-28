import java.util.Scanner;
public class Profit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price:");
        double cp=sc.nextDouble();
        System.out.println("enter selling price:");
        double sp=sc.nextDouble();
        double profit=sp-cp;
        double profit_percentage=(profit/sp)*100;
        double loss=cp-sp;
        double loss_percentage=(loss/cp)*100;
        System.out.println("PROFIT AMOUNT IS:"+profit);
        System.out.println("PROFIT PERCENTAGE IS:"+profit_percentage);
        System.out.println("LOSS AMOUNT IS:"+loss);
        System.out.println("LOSS PERCENTAGE IS:"+loss_percentage);
        sc.close();
    }
}
