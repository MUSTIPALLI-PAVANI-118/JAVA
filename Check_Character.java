import java.util.Scanner;
public class Check_Character {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A CHARACTER:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch <='Z'){
            System.out.println("ENTERED CHARACTER IS ALPHABET");        
        }else if(ch>='a' && ch <='z'){
            System.out.println("ENTERED CHARACTER IS ALPHABET");        
        }else if(ch>='0' && ch <='9'){
            System.out.println("ENTERED CHARACTER IS NUMBER");        
        }else{
            System.out.println("ENTERED CHARACTER IS SPECIAL CHARACTER");        
        }
        sc.close();
    }
}
