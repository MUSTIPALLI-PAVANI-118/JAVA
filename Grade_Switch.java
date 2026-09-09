import java.util.Scanner;
public class Grade_Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter grade in capitals");
        char grade=sc.next().charAt(0);
        switch(grade){
            case 'A':
                System.out.println("very excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("average");
                break;
            case 'D':
                System.out.println("improvement meeded");
                break;
            case 'F':
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid grade");
        }
        sc.close();
    }
}
