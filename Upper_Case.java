import java.util.Scanner;
public class Upper_Case {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("UPPER CASE LETTER");
        }
        else{
            System.out.println("NOT AN UPPER CASE LETTER");
        }
    sc.close();
    }

}
