import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a choice:");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        int choice=sc.nextInt();
        System.out.println("ENTER 1ST NUMBER:");
        double a=sc.nextDouble();
        System.out.println("ENTER 2ND NUMBER:");
        double b=sc.nextDouble();
        switch(choice){
            case 1:
                System.out.println("ADDITION OF NUMBERS:"+(a+b));
                break;
            case 2:
                System.out.println("SUBTRACTION OF NUMBERS:"+(a-b));
                break;
            case 3:
                System.out.println("MULTIPLICATION OF NUMBERS:"+(a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("DIVISION OF NUMBERS:"+(a/b));
                }
                else{
                    System.out.println("INVALID CHOICE");
                }
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
        sc.close();
    }
}
