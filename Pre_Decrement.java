import java.util.Scanner;
public class Pre_Decrement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num value");
        int num=sc.nextInt();
        System.out.println("number before decrement is:"+num);
        int n=--num;
        System.out.println("number after decrement is:"+n);
        sc.close();
    }
}
