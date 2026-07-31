import java.util.Scanner;
public class Square {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num=sc.nextInt();
        int square=num*num;
        int cube=num*num*num;
        System.out.println("SQUARE OF NUMBER IS:"+square);
        System.out.println("CUBE OF NUMBER IS:"+cube);
        sc.close();
    }
}
