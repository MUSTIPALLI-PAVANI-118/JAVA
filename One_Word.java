import java.util.Scanner;
public class One_Word {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD:");
        String word=sc.next();
        System.out.println("WORD:"+word);
        System.out.println("ENTER A LINE:");
        String line=sc.nextLine();
        System.out.println("LINE:"+line);
        sc.close();
    }
}
