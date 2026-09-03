import java.util.Scanner;
public class Month {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month number:");
        int n=sc.nextInt();
        if(n==1 || n==3 || n==5 || n==7 ||n==8 ||n==10 ||n==12){
            System.out.println("days in month are 31");
        }
        else if(n==2){
            System.out.println("days are 28 or 29");
        }
        else if(n == 4 || n == 6 || n == 9 || n == 11){
            System.out.println("days are 30 ");
        }
        else{
            System.out.println("invalid choice ");
        }
        sc.close();
    }
}
