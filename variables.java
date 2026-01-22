
//Write a program to read two numbers and print their sum, difference, product, and quotient
import java.util.Scanner;
public class variables{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number value num1 ");
    int num1=sc.nextInt();
    System.out.println("enter number value num2 ");
    int num2=sc.nextInt();
    int sum = num1+num2;
    int diff = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 %num2;
    System.out.println("the sum of numbers" + sum);
    System.out.println("the diff of numbers" + diff);
    System.out.println("the product of numbers" + product);
    System.out.println("the quotient of numbers" + quotient);
    sc.close();
  }
}

