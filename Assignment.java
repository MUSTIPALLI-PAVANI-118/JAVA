import java.util.Scanner;
public class Assignment {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("enter number:");
        int m=sc.nextInt();
        n+=m;
        System.out.println("UPDATED VALUE :"+n);
        n-=m;
        System.out.println("UPDATED VALUE :"+n);
        n *=m;
        System.out.println("UPDATED VALUE :"+n);
        n /=m;
        System.out.println("UPDATED VALUE:"+n);
        n%=m;
        System.out.println("UPDATED VALUE:"+n);
        sc.close();
    }
}
