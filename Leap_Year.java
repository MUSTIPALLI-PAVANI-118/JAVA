import java.util.Scanner;
public class Leap_Year {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR:");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("LEAP YEAR");
        }
        else if(year%100==0){
            System.out.println("NOT A LEAP YEAR");
        }
        else if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
        sc.close();
    }
}
