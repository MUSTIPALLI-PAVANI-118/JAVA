import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER:");
        int b=sc.nextInt();
        System.out.println("ENTER CHOICE");
        System.out.println("1.ADDITION");
        System.out.println("2.SUBTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("ADDITION OF NUMBERS "+(a+b));
                break;
            case 2:
                System.out.println("DIFFERENCE OF NUMBERS "+(a-b));
                break;
            case 3:
                System.out.println("MULTIPLICATION OF NUMBERS "+(a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("DIVISION OF NUMBERS "+((double)a/b));
                }else{
                    System.out.println("DIVISION OF NUMBERS not possible");
                }
                break;
            default:
                System.out.println("invalid choice");
        }

        sc.close();
    }
}
