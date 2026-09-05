import java.util.Scanner;
public class Scholarship {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks(out of 100):");
        int marks=sc.nextInt();
        System.out.println("enter attendance percentage:");
        double attendance=sc.nextDouble();
        if(marks>=75 && attendance>=75){
            System.out.println("eligible for scholarship");
        }
        else{
            System.out.println("not eligible for scholarship");
        }
        sc.close();
    }
}
