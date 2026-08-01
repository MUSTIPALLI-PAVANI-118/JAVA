import java.util.Scanner;
public class Sum_Digit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int digit=n%10;
            count +=digit;
            n=n/10;
        }
        System.out.println("sum of digits is "+count);
        sc.close();
    } 
}
