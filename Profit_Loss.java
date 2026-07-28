import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost price:");
        double cp=sc.nextDouble();
        System.out.println("enter the selling price:");
        double sp=sc.nextDouble();
        if(sp>cp){
            System.out.println("profit");
        }else if(sp<cp){
            System.out.println("loss");
        }else{
            System.out.println("no profit or no loss");
        }
        sc.close();
    }
}
