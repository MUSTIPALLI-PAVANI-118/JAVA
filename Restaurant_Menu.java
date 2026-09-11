import java.util.Scanner;
public class Restaurant_Menu {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.BIRYANI");
        System.out.println("2.BONELESS");
        System.out.println("3.FRIED RICE");
        System.out.println("enter choice:");
        int ch=sc.nextInt();
        System.out.println("enter quanntity:");
        int q=sc.nextInt();
        int price=0;
        switch(ch){
            case 1:
                price=160;
                break;
            case 2:
                price=140;
                break;
            case 3:
                price=140;
                break;
            default:
                System.out.println("INVALID CHOICE");

        }
        price=q*price;
        System.out.println("total price is "+price);
        sc.close();
    }
}
