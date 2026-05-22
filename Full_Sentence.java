import java.util.Scanner;
public class Full_Sentence{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence:");
        String s =sc.nextLine();
        System.out.println("THE FULL SENTENCE IS:"+s);
        sc.close();
    }
}