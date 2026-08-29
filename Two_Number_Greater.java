import java.util.Scanner;
public class Two_Number_Greater{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER:");
        int b=sc.nextInt();   
        if(a>b){
            System.out.println("GREATER NUMBER IS :"+a);
        }else if(a<b){
            System.out.println("GREATER NUMBER IS :"+b);
        }else{
            System.out.println("BOTH NUMBERS ARE EQUAL");
        }
    sc.close();
    }
}
