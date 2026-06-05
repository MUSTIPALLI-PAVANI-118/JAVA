import java.util.Scanner;
public class Divisible_Both {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("DIVISIBLE BY BOTH 3 AND 5");
        }
        else{
            System.out.println("NOT DIVISIBLE BY BOTH 3 AND 5");
        }
        sc.close();
    }
}
