import java.util.Scanner;
public class Largest_Among_4_Numbers{ 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int num1=sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2=sc.nextInt();
        System.out.println("enter the 3rd number");
        int num3=sc.nextInt();
        System.out.println("enter the 4th number");
        int num4=sc.nextInt();
        if(num1>=num2 && num1>=num3 && num1>=num4){
            System.out.println("maximum of four numbers is:"+num1);
        }
        else if(num2>=num1 && num2>=num3 && num2>=num4){
            System.out.println("maximum of four numbers is:"+num2);
        }
        else if(num3>=num1 && num3>=num2 && num3>=num4){
            System.out.println("maximum of four numbers is:"+num3);
        }
        else{
            System.out.println("maximum of four numbers is:"+num4);
        }
        
        sc.close();
    }
}
