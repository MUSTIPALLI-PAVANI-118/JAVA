import java.util.Scanner;
public class Salary {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("ENTER SALARY:");
        double salary=sc.nextDouble();
        System.out.print("ENTER BONUS:");
        double bonus=sc.nextDouble();
        double final_salary=salary+bonus;
        System.out.print("SALARY BEFORE BONUS:"+salary);
        System.out.print("SALARY AFTER BONUS:"+final_salary);
        sc.close();
    }
}
