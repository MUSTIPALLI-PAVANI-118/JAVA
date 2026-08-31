import java.util.Scanner;
public class Even {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is not even");
        }
        sc.close();
    }
}
