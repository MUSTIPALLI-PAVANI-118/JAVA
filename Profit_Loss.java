import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INVESTED AMOUNT:");
        double invested_amount=sc.nextDouble();
        System.out.println("ENTER output AMOUNT:");
        double output_amount=sc.nextDouble();
        if(output_amount>invested_amount){
            System.out.println("PROFIT");
        }
        else if(output_amount<invested_amount){
            System.out.println("loss");
        }else{
            System.out.println("no profit no loss");
        }
        sc.close();

    }
}
