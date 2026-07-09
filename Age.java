import java.util.Scanner;
public class Age{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE:");
        int age=sc.nextInt();
        System.out.println("my age is: "+age);
        sc.close();
    }
}