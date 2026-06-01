import java.util.Scanner;
public class Last_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int last_digit=num%100;
        System.out.println("last digits are:"+last_digit);
        sc.close();
    }
    
}
