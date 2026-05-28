import java.util.Scanner;
public class Square_Of_Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int Square=n*n;
        System.out.println("SQUARE OF NUMBER IS:"+Square);
        sc.close();
    }
}
