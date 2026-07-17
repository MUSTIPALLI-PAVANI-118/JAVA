import java.util.Scanner;
public class Divisible_3_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("number is divisible by both 3 and 5");
        }else{
            System.out.println("number is not divisible by both 3 and 5");
        }
        sc.close();
    }
}
