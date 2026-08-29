import java.util.Scanner;
public class Even_Odd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("NUMBER IS EVEN");
        }else{
            System.out.println("NUMBER IS ODD");
        }
        sc.close();
    }
}