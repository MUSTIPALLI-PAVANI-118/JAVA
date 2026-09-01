import java.util.Scanner;
public class Driving {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AGE:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("applicable for driving licence");
        }
        else{
            System.out.println("not applicable for driving licence");
        }
        sc.close();
    }
}
