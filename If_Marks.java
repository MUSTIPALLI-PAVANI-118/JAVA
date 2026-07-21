import java.util.Scanner;
public class If_Marks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER MARKS:");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("grade 'A'");
        }else if(marks>=75){
            System.out.println("grade 'B'");
        }else if(marks>=50){
            System.out.println("grade 'C'");
        }else if(marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        sc.close();
    }
}
