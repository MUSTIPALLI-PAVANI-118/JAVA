import java.util.Scanner;
public class Last_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int num=sc.nextInt();
        int last_digit=num%10;
        int last_two_digits=num%100;
        System.out.println("LAST DIGIT IS:"+last_digit);
        System.out.println("LAST TWO DIGIT IS:"+last_two_digits);
        sc.close();
    }
}
