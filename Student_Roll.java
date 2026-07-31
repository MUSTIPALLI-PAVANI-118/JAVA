import java.util.Scanner;
public class Student_Roll {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROLL NO:");
        int roll_no=sc.nextInt();
        System.out.printf("ROLL NUMBER IS %d",roll_no);
        sc.close();
    }
}
