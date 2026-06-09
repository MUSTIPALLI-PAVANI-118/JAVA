import java.util.Scanner;
public class Power {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        System.out.println("ENTER THE POWER:");
        int p=sc.nextInt();
        int result =1;
        for(int i=1;i<=p;i++){
            result *=n;
        }
        System.out.println("POWER OF NUMBER IS:"+result);
        sc.close();
    }
}
