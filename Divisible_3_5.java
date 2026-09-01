import java.util.Scanner;
public class Divisible_3_5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        if(n%5==0&&n%3==0){
            System.out.println("number is divible by both 3 and 5");
        }
        else{
            System.out.println("number is not divible by both 3 and 5");
        }
        sc.close(); 
    }
}