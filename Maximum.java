import java.util.Scanner;
public class Maximum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUM:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE 2ND NUM:");
        int num2=sc.nextInt();
        System.out.println("ENTER THE 3RD NUM:");
        int num3=sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("Greatest number is:"+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("Greatest number is:"+num2);
        }
        else{
            System.out.println("Greatest number is:"+num3);
        }
        sc.close();
    }
}
