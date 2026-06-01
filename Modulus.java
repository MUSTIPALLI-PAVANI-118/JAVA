import java.util.Scanner;
public class Modulus{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("NUMBER IS:"+n);
        }
        else{
            System.out.println("NUMBER IS:"+(-n));
        }
        sc.close();
    }
}