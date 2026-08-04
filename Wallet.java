import java.util.Scanner;
public class Wallet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE BALANCE:");
        double balance=sc.nextDouble();
        System.out.println("THE BALANCE IS:"+balance);    
        System.out.print("ENTER DEPOSIT MONEY:");
        double deposit=sc.nextDouble();
        balance+=deposit;
        System.out.println("UPDATED BALANCE IS:"+balance);
        System.out.print("ENTER SPEND MONEY:");
        double amount=sc.nextDouble();
        balance -=amount;
        System.out.println("UPDATED BALANCE IS:"+balance);
        sc.close();
    }
}
