import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num;
        while(true){
            num=sc.nextInt();
            if(num==-1){
                break;
            }
        }
        sc.close();
    }
}
