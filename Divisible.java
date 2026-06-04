import java.util.Scanner;
public class Divisible {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("DIVISIBLE BY 5");
        }
        else{
            System.out.println("NOT DIVISIBLE BY 5");
        }
        sc.close();
    }
}
