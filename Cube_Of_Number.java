import java.util.Scanner;
public class Cube_Of_Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int cube=n*n*n;
        System.out.println("CUBE OF NUMBER IS:"+cube);
        sc.close();
    }
}
