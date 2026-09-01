import java.util.Scanner;
public class Absolute {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("absolute value is:"+n);
        }
        else{
            System.out.println("absolute value is:"+(-n));
        }
        sc.close();
    }
}
