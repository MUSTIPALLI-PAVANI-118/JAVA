import java.util.Scanner;
public class Century_Year {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A YEAR:");
        int year=sc.nextInt();
        if(year%100==0){
            System.out.println("CENTURY YEAR");
        }
        else{
            System.out.println("NOT AN CENTURY YEAR");
            
        }
        sc.close();
    }
}
