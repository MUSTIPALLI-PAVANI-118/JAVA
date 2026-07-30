import java.util.Scanner;
public class Scanner_byte {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER BYTE VALUE:");
        byte num=sc.nextByte();
        System.out.println("BYTE VALUE IS "+num);
        sc.close();
    }
}
