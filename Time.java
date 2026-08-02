import java.util.Scanner;
public class Time {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TIME:");
        int time=sc.nextInt();
        int hour=time/60;
        int minutes=time%60;
        System.out.println("hours are:"+hour);
        System.out.println("minutes are:"+minutes);
        sc.close();
    }
}
