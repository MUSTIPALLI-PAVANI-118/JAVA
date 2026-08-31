import java.util.Scanner;
public class Discount {
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter price amount:");
        int price=sc.nextInt();
        if(price>1000){
            System.out.println("DISCOUNT IS APPLICABLE");
        }else{
            System.out.println("NO DISCOUNT IS APPLICABLE");
        }
        sc.close();
    }
}
