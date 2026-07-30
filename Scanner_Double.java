import java.util.Scanner;
public class Scanner_Double {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DOUBLE VALUE:");
        double num=sc.nextDouble();
        System.out.println("DOUBLE VALUE IS "+num);
        sc.close();
    }
}
