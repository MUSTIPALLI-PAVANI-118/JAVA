import java.util.Scanner;
public class Mark {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SUBJECT1 MARKS:");
        int sub1=sc.nextInt();
        System.out.println("ENTER SUBJECT2 MARKS:");
        int sub2=sc.nextInt();
        System.out.println("ENTER SUBJECT3 MARKS:");
        int sub3=sc.nextInt();
        double avg=(sub1+sub2+sub3)/3.0;
        System.out.println("average of three numbers:"+avg);
        System.out.println("ENTER SUBJECT4 MARKS:");
        int sub4=sc.nextInt();
        System.out.println("ENTER SUBJECT5 MARKS:");
        int sub5=sc.nextInt();
        double average=(sub1+sub2+sub3+sub4+sub5)/5.0;
        System.out.println("average of 5 numbers is:"+average);
        sc.close();
    }
}
