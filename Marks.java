import java.util.Scanner;
public class Hello{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE MARKS:");
    int marks=sc.nextInt();
    if (marks>=90){
      System.out.println("A grade");
    }else if(marks>=80){
      System.out.println("B grade");
    }else if(marks>=70){
      System.out.println("C grade");
    }else if(marks>=60){
      System.out.println("D grade");
    }else if(marks>=50){
      System.out.println("E grade");
    }else{
      System.out.println("FAIL");
    }
    sc.close();
  }
}
