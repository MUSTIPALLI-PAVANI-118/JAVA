import java.util.Scanner;
public class Operator_Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number:");
        double a=sc.nextDouble();
        System.out.println("enter the 2nd number:");
        double b=sc.nextDouble();
        System.out.println("enter operator(+,-,*,/):");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+' :
                System.out.println("result:"+(a+b));
                break;
            case '-':
                System.out.println("result:"+(a-b));
                break;
            case '*':
                System.out.println("result:"+(a*b));
                break;
            case '/':
                System.out.println("result:"+(a/b));
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }
        sc.close();
    }   
}
