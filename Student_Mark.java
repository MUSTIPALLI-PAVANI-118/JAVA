import java.util.Scanner;
public class Student_Mark {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter subject1 marks:");
        int sub1=sc.nextInt();
        System.out.println("enter subject2 marks:");
        int sub2=sc.nextInt();
        System.out.println("STUDENTS ARE PASSED "+(sub1>=35 && sub2>=35) );
        sc.close();
    }
}
