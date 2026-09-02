import java.util.Scanner;
public class Character {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character:");
        char ch =sc.next().charAt(0);
        if(ch=='a'&&ch=='z'||ch=='A' && ch=='Z'){
            System.out.println("alphabet");
        }
        else if(ch=='0'|| ch=='9'){
            System.out.println("number");
        }
        else{
            System.out.println("special character");
        }
        sc.close();
    }
}
