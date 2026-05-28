import java.util.Scanner;
public class Absolute {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("absolute value is:"+num);
        }
        else{
            System.out.println("absolute value is:"+(-num));
        }
        sc.close();
    }
    
}
