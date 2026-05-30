import java.util.Scanner;
public class Grade {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS(out of 100):");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=80){
            System.out.println("B");
        }
        else if(marks>=70){
            System.out.println("C");
        }
        else if(marks>=35){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        sc.close();
    }
}