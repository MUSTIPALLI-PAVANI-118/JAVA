import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price:");
        double cp=sc.nextDouble();
        System.out.println("enter selling price:");
        double sp=sc.nextDouble();
        double amount=sp-cp;
        if(amount>0){
            System.out.println("profit");
        }
        else{
            System.out.println("loss");
        }
        sc.close();
    }
}
