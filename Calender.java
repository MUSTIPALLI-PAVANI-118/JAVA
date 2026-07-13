import java.util.Scanner;
public class Calender {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter days:");
        int days=sc.nextInt();
        int year=days/365;
        int remaining=days%365;
        int months=remaining/30;
        int day=remaining%30;
        System.out.println("years:"+year);
        System.out.println("months:"+months);
        System.out.println("days:"+day);
        sc.close();
    }
}
