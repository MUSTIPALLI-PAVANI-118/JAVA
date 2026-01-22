//Write a program to find the largest of three numbers using nested if–else.

import java.util.Scanner;
public class Largest_num{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER a VALUE:");
    int a=sc.nextInt();
    System.out.println("ENTER b VALUE:");
    int b=sc.nextInt();
    System.out.println("ENTER c VALUE:");
    int c=sc.nextInt();
    if (a >=b && a>=c){
      System.out.println("the largest number among three values is " + a);
    } else if (b>=a && b>=c){
      System.out.println("the largest number among three values is " + b);
    }else{
       System.out.println("the largest number among three values is " + c);
    }
    sc.close();
  }
}

