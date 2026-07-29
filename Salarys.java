import java.util.Scanner;
public class Salarys {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary:");
        double salary=sc.nextDouble();
        System.out.println("enter bonus percentage:");
        double p=sc.nextDouble();
        double bonus=(salary*p)/100;
        double finalsalary=salary+bonus;
        System.out.println("FINAL SALARY IS:"+finalsalary);
        sc.close();
    }
}
