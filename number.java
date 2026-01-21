//Write a program to check whether a number is even or odd using if-else.

import java.util.Scanner;
public class num{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num value:");
   int num = sc.nextInt();
   if (num%2 == 0){
      System.out.println("num is even");
   }else {
     System.out.println("num is odd");
   }
    sc.close();
 }
}
