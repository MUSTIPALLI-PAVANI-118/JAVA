import java.util.Scanner;
public class Even_Odd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
    
}
