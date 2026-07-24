import java.util.Scanner;
public class Interest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter principle amount:");
        double p=sc.nextDouble();
        System.out.println("enter rate:");
        double r=sc.nextDouble();
        System.out.println("enter time:");
        double t=sc.nextDouble();
        double si=(p*r*t)/100;
        double amount=p+si;
        System.out.println("simple interest is:"+si);
        System.out.println("amount is:"+amount);
        double a=p*Math.pow((1+(r/100)),t);
        double ci=a-p;
        System.out.println("compound interest is:"+ci);
        System.out.println("amount is:"+a);
        sc.close();
    }
}
