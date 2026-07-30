import java.util.Scanner;
public class Sign {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("number is positive");
        }else if(num<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is zero");
        }
        sc.close();
    }
}
