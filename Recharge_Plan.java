import java.util.Scanner;
public class Recharge_Plan {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("350 rs + 2gb data + 28 days ");
                break;
            case 2:
                System.out.println("299 rs + 1.5gb data + 28 days ");
                break;
            case 3:
                System.out.println("199 rs + 1gb data + 28 days ");
                break;
            default:
                System.out.println("invalid plan");
        }
        sc.close();
    }
    
}
