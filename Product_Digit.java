import java.util.Scanner;
public class Product_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();
       int product=0;
       while(num>0){
        int digit =num%10;
        product = product +digit;
        num=num/10;
       }
       System.out.println("PRODUCT OF NUMBERS IS:"+product);
        sc.close();
    }
}
