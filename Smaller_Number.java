import java.util.Scanner;
public class Smaller_Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE 1st NUMBER:");
        int n=sc.nextInt();
        System.out.print("ENTER THE 2nd NUMBER:");
        int m=sc.nextInt();
        if(n<m){
            System.out.println("Smaller number is:"+n);
        }
        else if(m<n){
            System.out.println("Smaller number is:"+m);
        }
        else{
            System.out.println("both numbers are equal");
        }
        sc.close();
    }
}
