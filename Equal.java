import java.util.Scanner;
public class Equal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string:");
        String s=sc.nextLine();
        System.out.print("enter second string:");
        String q=sc.nextLine();
        if(s.equals(q)){
            System.out.println("both the strings are equal");
        }
        else{
            System.out.println("both the strings are not equal");
        }
        sc.close();
    }
}