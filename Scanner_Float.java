import java.util.Scanner;
public class Scanner_Float {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FLOAT VALUE:");
        float num=sc.nextFloat();
        System.out.println("FLOAT VALUE IS "+num);
        sc.close();
    }
}

