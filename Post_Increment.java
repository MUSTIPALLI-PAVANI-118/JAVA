import java.util.Scanner;
public class Post_Increment {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num value");
        int num=sc.nextInt();
        System.out.println("number before increment is:"+num);
        int n=num++;
        System.out.println("number after increment is:"+n);
        sc.close();
    }
}
