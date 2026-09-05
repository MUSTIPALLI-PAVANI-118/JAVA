import java.util.Scanner;
public class Bonus {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary:");
        double salary=sc.nextDouble();
        System.out.println("enter experience:");
        int n=sc.nextInt();
        if(n>=5){
            if (salary>=100000){
                System.out.println("eligible for bonus");
            }
            else{
                System.out.println("not eligible for bonus");
            }
        }
        else{
            System.out.println("not eligible for bonus");
        }
        sc.close();
    }
}
