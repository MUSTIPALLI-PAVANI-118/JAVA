import java.util.Scanner;
public class Not{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number(1 or 0):");
        int num1=sc.nextInt();
        if(!(num1==1)){
            System.out.println("logal not of numbers is 1");
        }
        else{
            System.out.println("logal not of numbers is 0");
        }
        sc.close();
    }
}