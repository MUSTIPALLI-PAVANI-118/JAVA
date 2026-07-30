import java.util.Scanner;
public class Scanner_Short {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SHORT VALUE:");
        short num=sc.nextShort();
        System.out.println("SHORT VALUE IS "+num);
        sc.close();
    }
}

