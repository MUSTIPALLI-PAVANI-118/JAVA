import java.util.Scanner;
public class Century_Year {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        int year=sc.nextInt();
        if(year%100==0){
            System.out.println("century year");
        }
        else{
            System.out.println("not a century year");
        }
        sc.close();

    }
    
}
