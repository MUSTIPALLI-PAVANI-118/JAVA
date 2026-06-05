import java.util.Scanner;
public class Last_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();
        int lastdigit=num%100;
        System.out.println("last digit of number is:"+lastdigit);
        sc.close();
    }
}
