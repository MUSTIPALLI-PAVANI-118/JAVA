import java.util.Scanner;
public class Plus {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=sc.nextInt();
        num += 1;
        System.out.println("finally number is:"+num);
        sc.close();
    }
}
