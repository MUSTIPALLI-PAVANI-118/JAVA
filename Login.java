import java.util.Scanner;
public class Login {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the boolean username:");
        boolean username=sc.nextBoolean();
        System.out.println("enter the boolean password:");
        boolean password=sc.nextBoolean();
        if(username==true && password==true){
            System.out.println("LOGIN SUCCESSFUL");
        }
        else{
            System.out.println("invalid crediantials");
        }
        sc.close();
    }
}
